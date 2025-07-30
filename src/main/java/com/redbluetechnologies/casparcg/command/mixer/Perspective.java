package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Perspective extends Command {
    public Perspective(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s PERSPECTIVE", videoChannelLayer));
    }

    public Perspective(VideoChannelLayer videoChannelLayer, Float topLeftX, Float topLeftY, Float topRightX, Float topRightY, Float bottomRightX, Float bottomRightY, Float bottomLeftX, Float bottomLeftY) {
        setCommand(String.format("MIXER %s PERSPECTIVE %s %s %s %s %s %s %s %s", videoChannelLayer, topLeftX, topLeftY, topRightX, topRightY, bottomRightX, bottomRightY, bottomLeftX, bottomLeftY));
    }

    public Perspective(VideoChannelLayer videoChannelLayer, Float topLeftX, Float topLeftY, Float topRightX, Float topRightY, Float bottomRightX, Float bottomRightY, Float bottomLeftX, Float bottomLeftY, Tween tween) {
        setCommand(String.format("MIXER %s PERSPECTIVE %s %s %s %s %s %s %s %s %s", videoChannelLayer, topLeftX, topLeftY, topRightX, topRightY, bottomRightX, bottomRightY, bottomLeftX, bottomLeftY, tween));
    }
}
