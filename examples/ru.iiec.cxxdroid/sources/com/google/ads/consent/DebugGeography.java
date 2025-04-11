package com.google.ads.consent;

public enum DebugGeography {
    DEBUG_GEOGRAPHY_DISABLED(0),
    DEBUG_GEOGRAPHY_EEA(1),
    DEBUG_GEOGRAPHY_NOT_EEA(2);
    
    private final int value;

    private DebugGeography(int i2) {
        this.value = i2;
    }

    public Integer h() {
        return Integer.valueOf(this.value);
    }
}
