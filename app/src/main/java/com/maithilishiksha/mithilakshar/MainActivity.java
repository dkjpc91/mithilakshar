package com.maithilishiksha.mithilakshar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo=findViewById(R.id.logo);
        ImageView mlogo=findViewById(R.id.mlogo);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.tranim);
        Animation animationm= AnimationUtils.loadAnimation(this,R.anim.alphaanim);
        animation.setDuration(2000);
        logo.startAnimation(animation);
        animationm.setDuration(2000);
        mlogo.startAnimation(animationm);


        RelativeLayout relativeLayout=findViewById(R.id.splash);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, login.class);
                startActivity(i);
                finish();
            }
        }, 3000);


    }
}