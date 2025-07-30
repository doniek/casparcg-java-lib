package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Levels extends Command {
    public Levels(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s LEVELS", videoChannelLayer));
    }

    public Levels(VideoChannelLayer videoChannelLayer, Float minInput, Float maxInput, Float gamma, Float minOutput, Float maxOutput) {
        setCommand(String.format("MIXER %s LEVELS %s %s %s %s %s", videoChannelLayer, minInput, maxInput, gamma, minOutput, maxOutput));
    }

    public Levels(VideoChannelLayer videoChannelLayer, Float minInput, Float maxInput, Float gamma, Float minOutput, Float maxOutput, Tween tween) {
        setCommand(String.format("MIXER %s LEVELS %s %s %s %s %s %s", videoChannelLayer, minInput, maxInput, gamma, minOutput, maxOutput, tween));
    }
}
