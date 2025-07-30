package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Invoke extends Command {
    public Invoke(VideoChannelLayer videoChannelLayer, String method) {
        setCommand(String.format("CG %s-%s INVOKE %s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer(), method));
    }
}
