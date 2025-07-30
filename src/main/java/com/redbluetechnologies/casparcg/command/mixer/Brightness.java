package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Brightness extends Command {
    public Brightness(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s BRIGHTNESS", videoChannelLayer));
    }

    public Brightness(VideoChannelLayer videoChannelLayer, Float brightness) {
        setCommand(String.format("MIXER %s BRIGHTNESS %s", videoChannelLayer, brightness));
    }

    public Brightness(VideoChannelLayer videoChannelLayer, Float brightness, Tween tween) {
        setCommand(String.format("MIXER %s BRIGHTNESS %s %s", videoChannelLayer, brightness, tween));
    }
}
