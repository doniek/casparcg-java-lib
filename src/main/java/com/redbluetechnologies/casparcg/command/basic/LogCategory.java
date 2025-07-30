package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;

public class LogCategory extends Command {
    public LogCategory(String category, boolean enabled) {
        setCommand(String.format("LOG CATEGORY %s %s", category, enabled ? "1" : "0"));
    }
}
