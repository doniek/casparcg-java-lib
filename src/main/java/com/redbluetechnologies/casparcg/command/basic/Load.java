package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Load extends Command {
    public Load(VideoChannelLayer videoChannelLayer, String clip) {
        setCommand(String.format("LOAD %s-%s  %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip));
    }

    public Load(VideoChannelLayer videoChannelLayer, String clip, String parameters) {
        setCommand(String.format("LOAD %s-%s  %s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip, parameters));
    }
}
