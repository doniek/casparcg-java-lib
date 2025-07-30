package com.redbluetechnologies.casparcg;

import com.redbluetechnologies.casparcg.command.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Communicator {
    private static final Logger logger = LoggerFactory.getLogger(Communicator.class);

    private Socket socket;
    private OutputStreamWriter output;
    private BufferedReader input;
    private final List<Listener> listeners = new ArrayList<>();
    private final String ipadress;
    private final int port;

    public Communicator(String ipadress, int port) {
        this.ipadress = ipadress;
        this.port = port;
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    private void notifyListeners(Listener.CasparCGEvent event) {
        for (Listener listener : listeners) {
            listener.onEvent(event);
        }
    }

    private boolean open() {
        if (socket != null && socket.isConnected() && !socket.isClosed()) {
            notifyListeners(Listener.CasparCGEvent.ONLINE);
            return true;
        }

        logger.debug("No connection available, opening a new connection");

        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(ipadress, port), 100);
            output = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            notifyListeners(Listener.CasparCGEvent.ONLINE);
            return true;
        } catch (IOException e) {
            logger.error("Connection failed: {}", e.getMessage());
            notifyListeners(Listener.CasparCGEvent.OFFLINE);
            return false;
        }
    }

    private Result executeCommand(String command) {
        Result result = null;

        if (this.open()) {
            try {
                output.write(command + "\r\n");
                output.flush();
                logger.debug(">> {}", command);

                if (!command.equals("BYE")) {
                    result = this.readResponse();
                }
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }

        return result;
    }

    @SuppressWarnings("java:S6916")
    private Result readResponse() throws IOException {
        long requestTime = System.currentTimeMillis();

        StringBuilder response = new StringBuilder();

        String header = readLineStrict(input); // eerste regel met status
        if (header == null) throw new IOException("Geen response van server");
        logger.debug("\t{}", header);

        response.append(header).append("\r\n");

        int status = Integer.parseInt(header.substring(0, 3));

        switch (status) {
            case 100 -> {
                // alleen header, geen data
            }
            case 101 -> {
                String line = input.readLine();
                if (line != null) response.append(line).append("\r\n");
            }

            case 200 -> {
                String line;
                while ((line = input.readLine()) != null) {
                    if (line.isEmpty()) break; // lege regel = einde
                    response.append(line).append("\r\n");
                }
            }
            case 201, 400 -> {
                //if(!response.toString().equals("201 DATA REMOVE OK\r\n")) {
                    String line = readLineStrict(input);
                    if (line != null) response.append(line).append("\r\n");
                //}
            }
            case 202 -> {
                // geen data
            }

            case 401, 402, 403, 404, 500, 501, 502, 503 -> {
                // geen data, alleen header
            }

            default -> throw new IOException("Onbekende statuscode: " + status);
        }

        return new Result(status, response.toString().trim(), requestTime);
    }

    private String readLineStrict(BufferedReader in) throws IOException {
        StringBuilder sb = new StringBuilder();
        int prev = -1;
        int curr;

        while ((curr = in.read()) != -1) {
            if (prev == '\r' && curr == '\n') {
                sb.setLength(sb.length() - 1); // remove '\r'
                break;
            }
            sb.append((char) curr);
            prev = curr;
        }

        return sb.isEmpty() && curr == -1 ? null : sb.toString();
    }

    public Result sendCommand(Command command) {
        return executeCommand(command.getCommand());
    }

    public void close() throws IOException {
        if(socket!=null && !socket.isClosed()) socket.close();
        if(output!=null) output.close();
        if(input!=null) input.close();
    }
}
