package sura.android.vr.sample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;
import sura.android.vr.sample.annotations.AnnotationsTestActivity;
import timber.log.Timber;

public class VRMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_vrmain);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Timber.tag(VRMainActivity.class.getSimpleName());

        Timber.d("Activity Created");
        Timber.i("Article open %s from '%s'.", "0000001", "news");

    }

    @OnClick(R.id.btn_test_annotations)
    public void startAnnotationsActivity(Button btnView) {
        Intent intent = new Intent(getApplicationContext(), AnnotationsTestActivity.class);
        startActivity(intent);
    }
}
