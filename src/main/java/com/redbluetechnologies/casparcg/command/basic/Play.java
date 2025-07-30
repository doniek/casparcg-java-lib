package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Play extends Command {
    public Play(VideoChannelLayer videoChannelLayer, String clip) {
        setCommand(String.format("PLAY %s-%s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip));
    }

    public Play(VideoChannelLayer videoChannelLayer, String clip, String parameters) {
        setCommand(String.format("PLAY %s-%s %s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip, parameters));
    }
}