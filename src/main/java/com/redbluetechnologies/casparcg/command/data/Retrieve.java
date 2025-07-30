package com.redbluetechnologies.casparcg.command.data;

import com.redbluetechnologies.casparcg.command.Command;

public class Retrieve extends Command {
    public Retrieve(String name) {
        setCommand(String.format("DATA RETRIEVE %s", name));
    }
}
