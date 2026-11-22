package mao.com.mycustomview.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import mao.com.mycustomview.view.PathMeasure.PathMeasureView;

/**
 * Created by 姣涢簰娣?on 2017/12/22 0022.
 *
 */

public class PathMeasureViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PathMeasureView(this));
    }
}

