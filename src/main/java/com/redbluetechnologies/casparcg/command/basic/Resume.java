package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Resume extends Command {
    public Resume(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("RESUME %s-%s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer()));
    }
}
