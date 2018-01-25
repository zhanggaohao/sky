package com.sky.web.utils;

import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sky.common.utils.MD5Util;

public class CookieUtils {
    
    private static String key = "SKY_CK_SSID";

    public static Cookie getCookie(HttpServletRequest request) {
        Cookie cookie = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                if (key.equalsIgnoreCase(c.getName())) {
                    cookie = c;
                }
            }
        }
        return cookie;
    }
    
    public static String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie(key, MD5Util.md5(UUID.randomUUID().toString()));
        //设置路径，这个路径即该工程下都可以访问该cookie 如果不设置路径，那么只有设置该cookie路径及其子路径可以访问
        cookie.setPath("/");
        response.addCookie(cookie);
        return cookie.getValue();
    }
    
}
