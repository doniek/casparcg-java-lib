package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Contrast extends Command {
    public Contrast(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s CONTRAST", videoChannelLayer));
    }

    public Contrast(VideoChannelLayer videoChannelLayer, Float contrast) {
        setCommand(String.format("MIXER %s CONTRAST %s", videoChannelLayer, contrast));
    }

    public Contrast(VideoChannelLayer videoChannelLayer, Float contrast, Tween tween) {
        setCommand(String.format("MIXER %ss CONTRAST %s %s", videoChannelLayer, contrast, tween));
    }
}
