package mao.com.mycustomview.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import mao.com.mycustomview.R;
import mao.com.mycustomview.view.Bezier.BezierView;
import mao.com.mycustomview.view.Bezier.BezierView2;

/**
 * Created by 姣涢簰娣?on 2017/11/6 0006.
 * 璐濆灏旀洸绾? */

public class BezierActivity extends AppCompatActivity {

    private BezierView2 bezierView2;
    private RadioGroup radioGroup;
    private RadioButton radioButton1,radioButton2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BezierView bezierView=new BezierView(this);

        setContentView(R.layout.bezierview_love_layout);

       /* bezierView2= (BezierView2) findViewById(R.id.bezier2_view);
        radioGroup= (RadioGroup) findViewById(R.id.radio_group);
        radioButton1= (RadioButton) findViewById(R.id.rb_point_one);
        radioButton2= (RadioButton) findViewById(R.id.rb_point_two);
*/
        /*radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == radioButton1.getId()){
                    bezierView2.steMode(true);
                }else if(checkedId == radioButton2.getId()){
                    bezierView2.steMode(false);
                }
            }
        });*/
    }
}

