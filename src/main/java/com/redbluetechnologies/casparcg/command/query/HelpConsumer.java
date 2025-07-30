package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class HelpConsumer extends Command {
    public HelpConsumer(String consumer) {
        setCommand(String.format("HELP CONSUMER %s", consumer));
    }
}
