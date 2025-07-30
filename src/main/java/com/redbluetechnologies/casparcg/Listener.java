package com.redbluetechnologies.casparcg;

public interface Listener {
    public enum CasparCGEvent {
        ONLINE,
        OFFLINE
    }
    void onEvent(CasparCGEvent event);
}
