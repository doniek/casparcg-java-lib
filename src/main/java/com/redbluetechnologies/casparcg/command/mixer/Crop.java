package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Crop extends Command {
    public Crop(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s CROP", videoChannelLayer));
    }

    public Crop(VideoChannelLayer videoChannelLayer, Float leftEdge, Float topEdge, Float rightEdge, Float bottomEdge) {
        setCommand(String.format("MIXER %s CROP %s %s %s %s", videoChannelLayer, leftEdge, topEdge, rightEdge, bottomEdge));
    }

    public Crop(VideoChannelLayer videoChannelLayer, Float leftEdge, Float topEdge, Float rightEdge, Float bottomEdge, Tween tween) {
        setCommand(String.format("MIXER %s CROP %s %s %s %s %s", videoChannelLayer, leftEdge, topEdge, rightEdge, bottomEdge, tween));
    }
}
