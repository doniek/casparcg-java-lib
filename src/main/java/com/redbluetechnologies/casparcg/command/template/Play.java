package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Play extends Command {
    public Play(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CG %s-%s PLAY %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer()));
    }
}
