package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Info extends Command {
    public Info() {
        setCommand("INFO");
    }

    public Info(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("INFO %s", videoChannelLayer));
    }
}
