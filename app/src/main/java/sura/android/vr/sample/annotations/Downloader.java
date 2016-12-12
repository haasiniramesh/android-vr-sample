package sura.android.vr.sample.annotations;

import android.support.annotation.CallSuper;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by anandhar on 12/3/16.
 */

public abstract class Downloader {
    // Declare the constants
    public static final int NAVIGATION_MODE_STANDARD = 0;
    public static final int NAVIGATION_MODE_LIST = 1;
    public static final int NAVIGATION_MODE_TABS = 2;

    // Define the list of accepted constants and declare the NavigationMode annotation
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({NAVIGATION_MODE_STANDARD, NAVIGATION_MODE_LIST, NAVIGATION_MODE_TABS})
    public @interface NavigationMode {
    }

    public Downloader(@NonNull String endPoint) {

    }

    @CallSuper
    protected void initDownload(@NavigationMode int mode) {

    }
}
