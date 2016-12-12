package sura.android.vr.sample.annotations;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import sura.android.vr.sample.R;

public class AnnotationsTestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotations_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Download File", Snackbar.LENGTH_LONG)
                        .setAction("Start", AnnotationsTestActivity.this).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(AnnotationsTestActivity.this);
                return true;
        }
        return (super.onOptionsItemSelected(menuItem));
    }

    @Override
    public void onClick(View view) {
        String fileUrl = null;
        String endPoint = null;
        int[] a = {1, 2};
        DownloadManager downloadManager =
                new DownloadManager(fileUrl,
                        endPoint, R.string.app_name, 200, a);

        downloadManager.startDownload(getApplicationContext());
    }
}
