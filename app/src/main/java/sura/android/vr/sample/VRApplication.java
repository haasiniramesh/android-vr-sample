package sura.android.vr.sample;

import android.app.Application;
import android.util.Log;

import timber.log.Timber;

/**
 * Created by anandhar on 12/1/16.
 */

public class VRApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportingTree());
        }
    }

    /** A tree which logs important information for crash reporting. */
    private static class CrashReportingTree extends Timber.Tree {
        @Override protected void log(int priority, String tag, String message, Throwable t) {
            if (priority > Log.INFO) {
                Crashlytics.log(tag + ": " + message);
            }

            if (t != null) {
                Crashlytics.logException(t);
            }
        }
    }
}
