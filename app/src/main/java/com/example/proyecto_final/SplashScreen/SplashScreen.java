package com.example.proyecto_final.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.proyecto_final.MainActivity;
import com.example.proyecto_final.R;

public class SplashScreen extends AppCompatActivity {
    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menus, textDesar;
    Animation frombottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
}
