package com.udacity.firebase.shoppinglistplusplus.utils;

import android.content.Context;

import java.text.SimpleDateFormat;

/**
 * Utility class
 */
public class Utils {
    /**
     * Format the date with SimpleDateFormat
     */
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("MMM dd, yyyy h:mm a");
    private Context mContext = null;


    /**
     * Public constructor that takes mContext for later use
     */
    public Utils(Context con) {
        mContext = con;
    }

    public static String formatDate(long time){
        return SIMPLE_DATE_FORMAT.format(time);
    }


}
