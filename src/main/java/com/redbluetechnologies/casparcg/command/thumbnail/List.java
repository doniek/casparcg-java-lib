package com.redbluetechnologies.casparcg.command.thumbnail;

import com.redbluetechnologies.casparcg.command.Command;

public class List extends Command {
    public List() {
        setCommand("THUMBNAIL LIST");
    }

    public List(String directory) {
        setCommand(String.format("THUMBNAIL LIST %s", directory));
    }
}
