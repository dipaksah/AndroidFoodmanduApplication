package com.dipak.foodmandu.ui.home.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.dipak.foodmandu.API.UserAPI;
import com.dipak.foodmandu.Model.User;
import com.dipak.foodmandu.R;
import com.dipak.foodmandu.URL.url;
import com.dipak.foodmandu.serverresponse.ImageResponse;
import com.dipak.foodmandu.strictmode.StrictModeClass;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.zip.Inflater;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private Integer [] images={R.drawable.slider1,R.drawable.slider2,R.drawable.slider6,R.drawable.slider7};
    private Object LayoutInflater;
    ImageView imageView;
    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
    List<User> usersList1;
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        
        LayoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = ((LayoutInflater) LayoutInflater).inflate(R.layout.image_slider,null);
        imageView=view.findViewById(R.id.imageView11);
        imageView.setImageResource(R.drawable.food);
        imageView.setImageResource(images[position]);
        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);
    }
}
