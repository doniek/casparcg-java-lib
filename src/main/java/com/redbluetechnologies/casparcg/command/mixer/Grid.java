package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Grid extends Command {
    public Grid(VideoChannelLayer videoChannelLayer, Integer resolution) {
        setCommand(String.format("MIXER %s GRID %s", videoChannelLayer.getVideoChannel(), resolution));
    }

    public Grid(VideoChannelLayer videoChannelLayer, Integer resolution, Tween tween) {
        setCommand(String.format("MIXER %s GRID %s %s", videoChannelLayer.getVideoChannel(), resolution, tween));
    }
}
