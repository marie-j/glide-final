package com.jones.tuto_glide;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


public class ImageLoader {

    public static void load(Context context, String url, ImageView view) {
        GlideApp.with(context).load(url).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(view);
    }
}
