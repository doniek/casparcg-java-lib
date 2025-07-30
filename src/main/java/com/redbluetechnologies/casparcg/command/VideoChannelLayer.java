package com.redbluetechnologies.casparcg.command;

public class VideoChannelLayer {
    private final Integer videoChannel;
    private final Integer layer;
    private final Integer templateLayer;

    public VideoChannelLayer(Integer videoChannel) {
        this.videoChannel = videoChannel;
        this.layer = null;
        this.templateLayer = null;
    }

    public VideoChannelLayer(Integer videoChannel, Integer layer) {
        this.videoChannel = videoChannel;
        this.layer = layer;
        this.templateLayer = null;
    }

    public VideoChannelLayer(Integer videoChannel, Integer layer, Integer templateLayer) {
        this.videoChannel = videoChannel;
        this.layer = layer;
        this.templateLayer = templateLayer;
    }

    public Integer getVideoChannel() {
        return videoChannel;
    }

    public Integer getLayer() {
        return layer;
    }

    public Integer getTemplateLayer() {
        return templateLayer;
    }

    public String toString() {
        if (layer != null) return videoChannel + "-" + layer;
        return videoChannel.toString();
    }
}
