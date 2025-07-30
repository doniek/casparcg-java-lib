package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Opacity extends Command {
    public Opacity(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s OPACITY", videoChannelLayer));
    }

    public Opacity(VideoChannelLayer videoChannelLayer, Float opacity) {
        setCommand(String.format("MIXER %s OPACITY %s", videoChannelLayer, opacity));
    }

    public Opacity(VideoChannelLayer videoChannelLayer, Float opacity, Tween tween) {
        setCommand(String.format("MIXER %s OPACITY %s %s", videoChannelLayer, opacity, tween));
    }
}
