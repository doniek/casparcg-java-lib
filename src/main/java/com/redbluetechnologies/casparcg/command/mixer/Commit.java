package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Commit extends Command {
    public Commit(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s COMMIT", videoChannelLayer.getVideoChannel()));
    }
}
