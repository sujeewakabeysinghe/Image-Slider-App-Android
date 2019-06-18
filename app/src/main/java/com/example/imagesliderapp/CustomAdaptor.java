package com.example.imagesliderapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdaptor extends PagerAdapter {

    int img[]={R.drawable.a,R.drawable.b,R.drawable.e,R.drawable.k};
    LayoutInflater inflater;
    Context ctx;

    public  CustomAdaptor(Context ctx){
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(LinearLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.sample,container,false);
        ImageView iv1=v.findViewById(R.id.iv1);
        TextView tv1=v.findViewById(R.id.tv1);
        iv1.setImageResource(img[position]);
        tv1.setText("Image: "+position);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.invalidate();
    }
}
