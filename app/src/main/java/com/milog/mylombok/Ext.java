package com.milog.mylombok;

import android.text.TextUtils;

import lombok.experimental.ExtensionMethod;

/**
 * Created by miloway on 2018/7/11.
 */

public class Ext {


    public static <T> T or(T obj, T ifNul) {
        return obj != null ? obj : ifNul;
    }

    public static String toLowerCase(String in) {
        if (TextUtils.isEmpty(in)) {
            return in;
        }
        return in.toLowerCase();
    }

    public static String toTitleCase(String in) {
        if (TextUtils.isEmpty(in)) {
            return in;
        }

        return Character.toTitleCase(in.charAt(0)) + in.substring(1).toLowerCase();
    }
}
