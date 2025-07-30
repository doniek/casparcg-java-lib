package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Pause extends Command {
    public Pause(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("PAUSE %s-%s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer()));
    }
}
