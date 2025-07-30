package com.redbluetechnologies.casparcg.command.basic;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

import java.util.Objects;

public class LoadBG extends Command {
    public LoadBG(VideoChannelLayer videoChannelLayer, String clip) {
        setCommand(String.format("LOADBG %s-%s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip));
    }

    public LoadBG(VideoChannelLayer videoChannelLayer, String clip, boolean loop, String transition, Integer duration, String tween, String direction, Integer seek, Integer length, boolean auto) {
        setCommand(String.format("LOADBG %s-%s %s %s %s %s %s %s %s %s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip, loop ? "LOOP" : "", transition, duration, tween, direction, seek, length, auto ? "AUTO" : ""));
    }

    public LoadBG(VideoChannelLayer videoChannelLayer, String clip, boolean loop, String transition, Integer duration, String tween, String direction, Integer seek, Integer length, String filter, boolean auto) {
        setCommand(String.format("LOADBG %s-%s %s %s %s %s %s %s %s %s %s %s", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), clip, loop ? "LOOP" : "", transition, duration, tween, direction, seek, length, !Objects.equals(filter, "") ? "FILTER " + filter : "", auto ? "AUTO" : ""));
    }
}
