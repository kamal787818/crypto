package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {
    ImageView Splash_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Splash_image=findViewById(R.id.splash_image);

        Animation splash_anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_animation);
        Splash_image.startAnimation(splash_anim);
        final Intent i = new Intent(splashscreen.this, loginactivitu.class);
        Thread Splash_timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }

            }
        };
        Splash_timer.start();

    }
}
