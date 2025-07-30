package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class Version extends Command {
    public Version() {
        setCommand("VERSION");
    }

    public Version(String component) {
        setCommand(String.format("VERSION %s", component));
    }
}
