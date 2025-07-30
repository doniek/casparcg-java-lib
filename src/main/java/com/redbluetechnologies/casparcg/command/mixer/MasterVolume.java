package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class MasterVolume extends Command {
    public MasterVolume(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s MASTERVOLUME", videoChannelLayer.getVideoChannel()));
    }

    public MasterVolume(VideoChannelLayer videoChannelLayer, Float volume) {
        setCommand(String.format("MIXER %s MASTERVOLUME %s", videoChannelLayer.getVideoChannel(), volume));
    }
}
