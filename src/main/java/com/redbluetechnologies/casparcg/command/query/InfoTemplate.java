package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class InfoTemplate extends Command {
    public InfoTemplate(String template) {
        setCommand(String.format("INFO TEMPLATE %s", template));
    }
}
