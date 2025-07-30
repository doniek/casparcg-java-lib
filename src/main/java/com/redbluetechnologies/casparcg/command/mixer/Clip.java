package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Clip extends Command {
    public Clip(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s CLIP", videoChannelLayer));
    }

    public Clip(VideoChannelLayer videoChannelLayer, Float x, Float y, Float width, Float height) {
        setCommand(String.format("MIXER %s CLIP %s %s %s %s", videoChannelLayer, x, y, width, height));
    }

    public Clip(VideoChannelLayer videoChannelLayer, Float x, Float y, Float width, Float height, Tween tween) {
        setCommand(String.format("MIXER %s CLIP %s %s %s %s %s", videoChannelLayer, x, y, width, height, tween));
    }
}
