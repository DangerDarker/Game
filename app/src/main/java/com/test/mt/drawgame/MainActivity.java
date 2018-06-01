package com.test.mt.drawgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntroView intro = view.findViewById(R.id.svg_intro);
        if (intro == null) {
            intro = (IntroView) getLayoutInflater().inflate(R.layout.include_logo_animation, null, false);
            intro.setSvgResource(R.raw.logo_512);
//                    ((ViewGroup) c.findViewById(R.id.layout_logo_animation)).addView(intro, 1);
            ((ViewGroup) view.findViewById(R.id.layout_logo_animation)).addView(intro, 0);
        }

    }
}
