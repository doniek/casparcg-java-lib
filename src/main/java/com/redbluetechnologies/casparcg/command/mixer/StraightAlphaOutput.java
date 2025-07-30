package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class StraightAlphaOutput extends Command {
    public StraightAlphaOutput(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s STRAIGHT_ALPHA_OUTPUT", videoChannelLayer));
    }

    public StraightAlphaOutput(VideoChannelLayer videoChannelLayer, boolean straightAlpha) {
        setCommand(String.format("MIXER %s STRAIGHT_ALPHA_OUTPUT %s", videoChannelLayer, straightAlpha ? "1" : "0"));
    }
}
