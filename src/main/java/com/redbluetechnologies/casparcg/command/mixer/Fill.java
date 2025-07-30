package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Fill extends Command {
    public Fill(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s FILL", videoChannelLayer));
    }

    public Fill(VideoChannelLayer videoChannelLayer, Float x, Float y, Float xScale, Float yScale) {
        setCommand(String.format("MIXER %s FILL %s %s %s %s", videoChannelLayer, x, y, xScale, yScale));
    }

    public Fill(VideoChannelLayer videoChannelLayer, Float x, Float y, Float xScale, Float yScale, Tween tween) {
        setCommand(String.format("MIXER %s FILL %s %s %s %s %s", videoChannelLayer, x, y, xScale, yScale, tween));
    }
}
