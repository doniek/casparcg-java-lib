package com.redbluetechnologies.casparcg.command.query;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class InfoDelay extends Command {
    public InfoDelay(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("INFO %s DELAY", videoChannelLayer));
    }
}
