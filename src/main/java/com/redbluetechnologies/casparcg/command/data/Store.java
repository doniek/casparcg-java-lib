package com.redbluetechnologies.casparcg.command.data;

import com.redbluetechnologies.casparcg.command.Command;

public class Store extends Command {
    public Store(String name, String data) {
        setCommand(String.format("DATA STORE %s %s", name, data));
    }
}
