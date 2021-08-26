package com.myapt.util;

import java.util.UUID;

public class TrackingUtil {

    public static String generateTrackingId() {
        return UUID.randomUUID().toString();
    }
}
