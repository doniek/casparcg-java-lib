package com.redbluetechnologies.casparcg.command.thumbnail;

import com.redbluetechnologies.casparcg.command.Command;

public class Generate extends Command {
    public Generate(String filename) {
        setCommand(String.format("THUMBNAIL GENERATE %s", filename));
    }
}
