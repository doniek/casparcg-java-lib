package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class MipMap extends Command {
    public MipMap(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s MIPMAP", videoChannelLayer));
    }

    public MipMap(VideoChannelLayer videoChannelLayer, boolean mipmap) {
        setCommand(String.format("MIXER %s MIPMAP %s", videoChannelLayer, mipmap ? "1" : "0"));
    }
}
