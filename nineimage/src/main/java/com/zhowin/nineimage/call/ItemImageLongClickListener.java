package com.zhowin.nineimage.call;

import android.content.Context;
import android.widget.ImageView;

import java.util.List;

/**
 * item的长按点击事件
 */
public interface ItemImageLongClickListener<T> {
    boolean onItemImageLongClick(Context context, ImageView imageView, int index, List<T> list);
}
