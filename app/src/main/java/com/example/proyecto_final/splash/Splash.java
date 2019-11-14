package com.example.proyecto_final.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.proyecto_final.MainActivity;
import com.example.proyecto_final.R;

public class Splash extends AppCompatActivity {
    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menus, textDesar;
    Animation frombottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
}
