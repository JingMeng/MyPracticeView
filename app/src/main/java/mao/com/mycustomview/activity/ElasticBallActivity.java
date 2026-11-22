package mao.com.mycustomview.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mao.com.mycustomview.R;
import mao.com.mycustomview.view.elastic.ElasticballView;


/**
 * Created by 姣涢簰娣?on 2017/11/29 0029.
 * 鑷畾涔夋帶浠?婊戝姩寮规€у皬鐞? */

public class ElasticBallActivity extends AppCompatActivity {

    Button bt_start_anim;
    ElasticballView myElasticballView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elasticball_layout);
        bt_start_anim=findViewById(R.id.bt_start_anim);
        myElasticballView=findViewById(R.id.my_elastic_ball);
        bt_start_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myElasticballView.startAnimation();
            }
        });
    }
}

