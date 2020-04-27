package com.example.sanitizerbracelet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp ,logo, time,notification,charge,customer;
    LinearLayout menus;
    Animation frombottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgapp = (ImageView)findViewById(R.id.bg);
        logo = (ImageView)findViewById(R.id.logo);
        menus = (LinearLayout) findViewById(R.id.menue);
        time = (ImageView)findViewById(R.id.time);
        notification = (ImageView)findViewById(R.id.not);
        charge = (ImageView)findViewById(R.id.charge);
        customer = (ImageView)findViewById(R.id.customer_service);



        bgapp.animate().translationY(-1100).setDuration(800).setStartDelay(2000);
        logo.animate().translationY(-620).setDuration(800).setStartDelay(2000);
//       logo.animate().translationX(-350).setDuration(1000).setStartDelay(3000);
//       menus.animate().translationY(-620).setDuration(1000).setStartDelay(3000);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        menus.startAnimation(frombottom);

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Time.class);
                startActivity(intent);
            }
        });


        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Notification.class);
                startActivity(intent);
            }
        });


        charge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Battery.class);
                startActivity(intent);
            }
        });


        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Customer_Service.class);
                startActivity(intent);
            }
        });






    }
}
