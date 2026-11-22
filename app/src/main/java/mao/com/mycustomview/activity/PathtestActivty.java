package mao.com.mycustomview.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import mao.com.mycustomview.view.PathView;

/**
 * Created by 姣涢簰娣?on 2017/11/1 0001.
 * 璺緞娴嬭瘯View
 */

public class PathtestActivty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PathView pathView=new PathView(this);
        setContentView(pathView);
    }

}

