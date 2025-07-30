package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class Help extends Command {
    public Help() {
        setCommand("HELP");
    }

    public Help(String command) {
        setCommand(String.format("HELP %s", command));
    }
}
