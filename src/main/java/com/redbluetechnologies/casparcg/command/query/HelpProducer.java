package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;

public class HelpProducer extends Command {
    public HelpProducer(String producer) {
        setCommand(String.format("HELP PRODUCER %s", producer));
    }
}
