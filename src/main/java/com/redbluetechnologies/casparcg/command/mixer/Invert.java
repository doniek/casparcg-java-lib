package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Invert extends Command {
    public Invert(VideoChannelLayer videoChannelLayer, boolean invert) {
        setCommand(String.format("MIXER %s INVERT %s", videoChannelLayer, invert ? "1" : "0"));
    }
}
