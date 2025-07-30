package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class TLS extends Command {
    public TLS() {
        setCommand("TLS");
    }

    public TLS(String directory) {
        setCommand(String.format("TLS %s", directory));
    }
}
