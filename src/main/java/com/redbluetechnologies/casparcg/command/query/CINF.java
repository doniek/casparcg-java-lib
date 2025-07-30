package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class CINF extends Command {
    public CINF(String filename) {
        setCommand(String.format("CINF %s", filename));
    }
}
