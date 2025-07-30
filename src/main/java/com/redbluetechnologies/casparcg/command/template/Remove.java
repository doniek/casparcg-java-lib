package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Remove extends Command {
    public Remove(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CG %s-%s REMOVE %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer()));
    }
}
