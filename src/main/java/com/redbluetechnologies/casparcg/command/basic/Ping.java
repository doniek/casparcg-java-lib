package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;

public class Ping extends Command {
    public Ping() {
        setCommand("PING");
    }
}
