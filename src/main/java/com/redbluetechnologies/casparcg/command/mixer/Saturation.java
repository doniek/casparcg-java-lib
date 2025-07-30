package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Saturation extends Command {
    public Saturation(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s SATURATION", videoChannelLayer));
    }

    public Saturation(VideoChannelLayer videoChannelLayer, Float saturation) {
        setCommand(String.format("MIXER %s SATURATION %s", videoChannelLayer, saturation));
    }

    public Saturation(VideoChannelLayer videoChannelLayer, Float saturation, Tween tween) {
        setCommand(String.format("MIXER %s SATURATION %s %s", videoChannelLayer, saturation, tween));
    }
}
