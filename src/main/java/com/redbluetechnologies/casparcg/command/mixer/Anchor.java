package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Anchor extends Command {
    public Anchor(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s ANCHOR", videoChannelLayer));
    }

    public Anchor(VideoChannelLayer videoChannelLayer, Float x, Float y) {
        setCommand(String.format("MIXER %s ANCHOR %s %s", videoChannelLayer, x, y));
    }

    public Anchor(VideoChannelLayer videoChannelLayer, Float x, Float y, Tween tween) {
        setCommand(String.format("MIXER %s ANCHOR %s %s %s", videoChannelLayer, x, y, tween));
    }
}
