package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Clear extends Command {
    public Clear(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CLEAR %s-%s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer()));
    }
}
