package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Volume extends Command {
    public Volume(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s VOLUME", videoChannelLayer));
    }

    public Volume(VideoChannelLayer videoChannelLayer, Float volume) {
        setCommand(String.format("MIXER %s VOLUME %s", videoChannelLayer, volume));
    }

    public Volume(VideoChannelLayer videoChannelLayer, Float volume, Tween tween) {
        setCommand(String.format("MIXER %s VOLUME %s %s", videoChannelLayer, volume, tween));
    }
}
