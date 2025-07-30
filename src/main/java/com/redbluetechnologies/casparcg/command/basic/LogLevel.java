package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;

public class LogLevel extends Command {
    public LogLevel(String level) {
        setCommand(String.format("LOG LEVEL %s", level));
    }
}
