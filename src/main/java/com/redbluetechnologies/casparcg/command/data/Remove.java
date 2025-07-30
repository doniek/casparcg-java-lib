package com.redbluetechnologies.casparcg.command.data;

import com.redbluetechnologies.casparcg.command.Command;

public class Remove extends Command {
    public Remove(String name) {
        setCommand(String.format("DATA REMOVE %s", name));
    }
}
