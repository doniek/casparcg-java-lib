package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Clear extends Command {
    public Clear(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s CLEAR", videoChannelLayer));
    }
}
