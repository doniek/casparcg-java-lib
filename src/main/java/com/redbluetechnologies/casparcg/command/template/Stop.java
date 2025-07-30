package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Stop extends Command {
    public Stop(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CG %s-%s STOP %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer()));
    }
}
