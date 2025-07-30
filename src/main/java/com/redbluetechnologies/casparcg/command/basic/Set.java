package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Set extends Command {
    public Set(VideoChannelLayer videoChannelLayer, String variable, String value) {
        setCommand(String.format("SET %s %s %s", videoChannelLayer.getVideoChannel(), variable, value));
    }
}
