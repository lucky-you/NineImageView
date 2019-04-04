package com.zhowin.nineimage.adapter;

import android.content.Context;
import android.widget.ImageView;

import java.util.List;

/**
 * item的adapter
 */
public abstract class NineGridImageViewAdapter<T> {


    public abstract void onDisplayImage(Context context, ImageView imageView, T t);

    public void onItemImageClick(Context context, ImageView imageView, int index, List<T> list) {

    }

    public boolean onItemImageLongClick(Context context, ImageView imageView, int index, List<T> list) {
        return false;
    }

    public ImageView createImageView(Context context) {
        ImageView imageView = new ImageView(context);
        return imageView;
    }
}