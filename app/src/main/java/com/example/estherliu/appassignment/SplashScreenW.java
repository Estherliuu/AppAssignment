package com.example.estherliu.appassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_w);

       /* Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5500);
                    Intent intent = new Intent(getApplicationContext(), MainActivty.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        myThread.start();
    */
    Intent intent = new Intent(this, MainActivty.class);
    startActivity(intent);
    }
}
