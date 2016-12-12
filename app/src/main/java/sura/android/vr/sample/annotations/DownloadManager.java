package sura.android.vr.sample.annotations;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import android.support.annotation.StringRes;
import android.support.annotation.WorkerThread;
import android.support.v4.app.ActivityCompat;

import static android.content.Intent.ACTION_CALL;

/**
 * Created by anandhar on 12/3/16.
 */

public class DownloadManager extends Downloader {
    public DownloadManager(@NonNull String fileUrl,
                           @NonNull String endPoint,
                           @StringRes int resId,
                           @IntRange(from = 0, to = 255) int alpha,
                           @Size(min = 0, max = 10) int size[]) {
        super(endPoint);
    }

    @WorkerThread
    @RequiresPermission(Manifest.permission.INTERNET)
    public void startDownload(@NonNull Context context) {

        Intent intent = new Intent(ACTION_CALL);
        intent.setData(Uri.parse("tel:9740520024"));

        if (ActivityCompat.checkSelfPermission(context,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(context, intent);
    }

    protected void startActivity(@NonNull Context context,@RequiresPermission Intent intent) {
        context.startActivity(intent);
    }
}
