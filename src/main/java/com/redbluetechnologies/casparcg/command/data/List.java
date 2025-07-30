package com.redbluetechnologies.casparcg.command.data;

import com.redbluetechnologies.casparcg.command.Command;

public class List extends Command {
    public List() {
        setCommand("DATA LIST");
    }

    public List(String directory) {
        setCommand(String.format("DATA LIST %s", directory));
    }
}
