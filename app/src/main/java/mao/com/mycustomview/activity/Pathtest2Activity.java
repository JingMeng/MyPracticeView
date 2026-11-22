package mao.com.mycustomview.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import mao.com.mycustomview.view.PathView2;

/**
 * Created by 姣涢簰娣?on 2017/12/18 0018.
 */

public class Pathtest2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PathView2(this));
    }
}

