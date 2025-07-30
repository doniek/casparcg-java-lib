package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Update extends Command {
    public Update(VideoChannelLayer videoChannelLayer, String data) {
        setCommand(String.format("CG %s-%s UPDATE %s <templateData>%s</templateData>", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer(), data));
    }
}
