package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Rotation extends Command {
    public Rotation(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s ROTATION", videoChannelLayer));
    }

    public Rotation(VideoChannelLayer videoChannelLayer, Float angle) {
        setCommand(String.format("MIXER %s ROTATION %s", videoChannelLayer, angle));
    }

    public Rotation(VideoChannelLayer videoChannelLayer, Float angle, Tween tween) {
        setCommand(String.format("MIXER %s ROTATION %s %s", videoChannelLayer, angle, tween));
    }
}
