package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Swap extends Command {
    public Swap(VideoChannelLayer primaryVideoChannelLayer, VideoChannelLayer secondaryVideoChannelLayer) {
        setCommand(String.format("SWAP %s-%s %s-%s", primaryVideoChannelLayer.getVideoChannel(), primaryVideoChannelLayer.getLayer(), secondaryVideoChannelLayer.getVideoChannel(), secondaryVideoChannelLayer.getLayer()));
    }

    public Swap(VideoChannelLayer primaryVideoChannelLayer, VideoChannelLayer secondaryVideoChannelLayer, String parameters) {
        setCommand(String.format("SWAP %s-%s %s-%s %s", primaryVideoChannelLayer.getVideoChannel(), primaryVideoChannelLayer.getLayer(), secondaryVideoChannelLayer.getVideoChannel(), secondaryVideoChannelLayer.getLayer(), parameters));
    }
}
