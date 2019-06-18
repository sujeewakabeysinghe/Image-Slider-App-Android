package com.example.imagesliderapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    //CustomAdaptor customAdaptor;
    //ViewPager viewPager;
    ViewFlipper vf1;
    int img[]={
            R.drawable.a,
            R.drawable.b,
            R.drawable.e,
            R.drawable.k
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //viewPager=findViewById(R.id.vp1);
        //customAdaptor=new CustomAdaptor(this);
        //viewPager.setAdapter(customAdaptor);
        vf1=findViewById(R.id.vf1);
        for (int i=0;i<img.length;i++){
            fi(img[i]);
        }
    }
    public void fi(int i){
        ImageView view=new ImageView(this);
        view.setBackgroundResource(i);
        vf1.addView(view);
        vf1.setFlipInterval(4000);
        vf1.setAutoStart(true);
        vf1.setOutAnimation(this,android.R.anim.slide_out_right);
        vf1.setInAnimation(this,android.R.anim.slide_in_left);
    }
}
