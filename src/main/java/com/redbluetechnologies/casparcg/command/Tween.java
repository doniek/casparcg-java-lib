package com.redbluetechnologies.casparcg.command;

public class Tween {
    private final Integer duration;
    private final String animation;

    public Tween(Integer duration, String animation) {
        this.duration = duration;
        this.animation = animation;
    }

    public String toString() {
        return String.format("%s %s", duration, animation);
    }
}
