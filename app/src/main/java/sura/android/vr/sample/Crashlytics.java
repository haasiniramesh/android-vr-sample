package sura.android.vr.sample;

import android.util.Log;

/**
 * Created by anandhar on 12/3/16.
 */

public class Crashlytics {
    public static void log(String s) {
        Log.i("", s);
    }

    public static void logException(Throwable t) {
        t.printStackTrace();
    }
}
