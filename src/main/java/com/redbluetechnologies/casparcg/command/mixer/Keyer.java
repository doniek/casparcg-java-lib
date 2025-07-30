package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Keyer extends Command {
    public Keyer(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s KEYER", videoChannelLayer));
    }

    public Keyer(VideoChannelLayer videoChannelLayer, boolean keyer) {
        setCommand(String.format("MIXER %s KEYER %s", videoChannelLayer, keyer ? "1" : "0"));
    }
}
