package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Blend extends Command {
    public Blend(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s BLEND", videoChannelLayer));
    }

    public Blend(VideoChannelLayer videoChannelLayer, String blend) {
        setCommand(String.format("MIXER %s BLEND %s", videoChannelLayer, blend));
    }
}
