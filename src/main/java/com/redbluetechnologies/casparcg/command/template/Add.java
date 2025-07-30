package com.redbluetechnologies.casparcg.command.template;

import com.redbluetechnologies.casparcg.command.Command;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;

public class Add extends Command {
    public Add(VideoChannelLayer videoChannelLayer, String template, boolean playOnLoad, String data) {
        setCommand(String.format("CG %s-%s ADD %s \"%s\" %s \"<templateData>%s</templateData>\"", videoChannelLayer.getVideoChannel(), videoChannelLayer.getLayer(), videoChannelLayer.getTemplateLayer(), template, playOnLoad ? "1": "0", escape(data)));
    }

    private static String escape(String input) {
        return input
                .replace("\\", "\\\\")
                .replace("\"", "\\\"");
                //.replace("\n", "\\n")
                //.replace("\r", "\\r");
    }
}
