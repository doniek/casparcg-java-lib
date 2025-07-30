package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Clear extends Command {
    public Clear(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CG %s-%s CLEAR", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer()));
    }
}
