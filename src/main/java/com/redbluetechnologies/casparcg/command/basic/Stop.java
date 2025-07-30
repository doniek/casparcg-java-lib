package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Stop extends Command {
    public Stop(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("STOP %s-%s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer()));
    }
}
