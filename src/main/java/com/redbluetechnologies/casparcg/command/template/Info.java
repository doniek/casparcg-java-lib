package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Info extends Command {
    public Info(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CG %s-%s INFO %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer()));
    }
}
