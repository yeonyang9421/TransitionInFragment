package kr.co.woobi.imyeon.transitioninfragment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout menu1 = findViewById(R.id.menu1);
        LinearLayout menu2 = findViewById(R.id.menu2);
        LinearLayout menu3 = findViewById(R.id.menu3);
        LinearLayout menu4 = findViewById(R.id.menu4);
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        menu3.setOnClickListener(this);
        menu4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu1:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim)
                        .replace(R.id.frame, TransitionFragment
                                .newInstance("It's your First Fragment",Color.parseColor("#3F51B5"))).commit();
                break;
            case R.id.menu2:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_anim2, R.anim.exit_anim)
                        .replace(R.id.frame, TransitionFragment
                                .newInstance("It's your Second Fragment",Color.parseColor("#CDDC39"))).commit();
                break;
            case R.id.menu3:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_anim2, R.anim.exit_anim2)
                        .replace(R.id.frame, TransitionFragment
                                .newInstance("It's your Third Fragment",Color.parseColor("#FF4CAF50"))).commit();
                break;
            case R.id.menu4:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim2)
                        .replace(R.id.frame, TransitionFragment
                                .newInstance("It's your Fourth Fragment",Color.parseColor("#FF5722"))).commit();
                break;
        }
    }
}
