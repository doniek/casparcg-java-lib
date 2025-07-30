package com.redbluetechnologies.casparcg.command.mixer;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.Tween;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Chroma extends Command {
    public Chroma(VideoChannelLayer videoChannelLayer) {
        setCommand(String.format("MIXER %s CHROMA", videoChannelLayer));
    }

    public Chroma(VideoChannelLayer videoChannelLayer, boolean enable, Float targetHue, Float hueWidth, Float minSaturation, Float minBrightness, Float softness, Float spillSuppress, Float spillSuppressSaturation, boolean showMask) {
        setCommand(String.format("MIXER %s CHROMA %s %s %s %s %s %s %s %s %s", videoChannelLayer, enable ? "1" : "0", targetHue, hueWidth, minSaturation, minBrightness, softness, spillSuppress, spillSuppressSaturation, showMask ? "1" : "0"));
    }

    public Chroma(VideoChannelLayer videoChannelLayer, boolean enable, Float targetHue, Float hueWidth, Float minSaturation, Float minBrightness, Float softness, Float spillSuppress, Float spillSuppressSaturation, boolean showMask, Tween tween) {
        setCommand(String.format("MIXER %s CHROMA %s %s %s %s %s %s %s %s %s %s", videoChannelLayer, enable ? "1" : "0", targetHue, hueWidth, minSaturation, minBrightness, softness, spillSuppress, spillSuppressSaturation, showMask ? "1" : "0", tween));
    }
}
