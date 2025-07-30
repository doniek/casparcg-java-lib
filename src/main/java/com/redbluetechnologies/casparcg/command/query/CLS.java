package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class CLS extends Command {
    public CLS() {
        setCommand("CLS");
    }

    public CLS(String directory) {
        setCommand(String.format("CLS %s", directory));
    }
}
