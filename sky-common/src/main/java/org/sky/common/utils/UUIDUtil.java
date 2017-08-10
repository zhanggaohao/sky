package org.sky.common.utils;

import java.util.UUID;

public class UUIDUtil {
    
    public static String getID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
