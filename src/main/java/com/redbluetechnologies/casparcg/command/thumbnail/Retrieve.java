package com.redbluetechnologies.casparcg.command.thumbnail;

import com.redbluetechnologies.casparcg.command.Command;

public class Retrieve extends Command {
    public Retrieve(String filename) {
        setCommand(String.format("THUMBNAIL RETRIEVE %s", filename));
    }
}
