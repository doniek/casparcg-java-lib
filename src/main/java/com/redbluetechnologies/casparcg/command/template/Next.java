package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Next extends Command {
    public Next(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("CG %s-%s NEXT %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer()));
    }
}
