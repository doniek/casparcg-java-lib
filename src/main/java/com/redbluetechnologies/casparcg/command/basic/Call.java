package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Call extends Command {
    public Call(VideoChannelLayer videoChannelLayer, String parameters) {
        setCommand(String.format("CALL %s-%s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), parameters));
    }
}
