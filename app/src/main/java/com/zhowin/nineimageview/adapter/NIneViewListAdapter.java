package com.zhowin.nineimageview.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhowin.nineimage.adapter.NineGridImageViewAdapter;
import com.zhowin.nineimage.view.NineGroupImageView;
import com.zhowin.nineimage.view.RoundImageView;
import com.zhowin.nineimageview.R;
import com.zhowin.nineimageview.model.NineImageList;

import java.util.List;

/**
 * author      : Z_B
 * date       : 2019/4/13
 * function  : 九宫格图片显示  不能直接使用List<String> 类型的集合作为图片的数据源
 */
public class NIneViewListAdapter extends BaseQuickAdapter<NineImageList, BaseViewHolder> {
    public NIneViewListAdapter(@Nullable List<NineImageList> data) {
        super(R.layout.include_nine_image_item_view, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NineImageList item) {
        helper.setText(R.id.tvContent, item.getTitle());
        NineGroupImageView nineGroupImageView = helper.getView(R.id.nineGridView);
        nineGroupImageView.setAdapter(mAdapter);
        nineGroupImageView.setImagesData(item.getImageList());//先setAdapter 然后再setImagesData

    }


    private NineGridImageViewAdapter<String> mAdapter = new NineGridImageViewAdapter<String>() {
        @Override
        public void onDisplayImage(Context context, ImageView imageView, String s) {
            Glide.with(mContext).load(s).into(imageView);
        }

        @Override
        public ImageView createImageView(Context context) {
            //不使用默认的图片
            RoundImageView roundImageView = new RoundImageView(mContext);
            roundImageView.setType(RoundImageView.TYPE_ROUND);
            roundImageView.setCornerRadius(4);
            return roundImageView;
        }

        @Override
        public void onItemImageClick(Context context, ImageView imageView, int index, List<String> list) {
            Toast.makeText(context, "点击了图片" + index, Toast.LENGTH_LONG).show();
            super.onItemImageClick(context, imageView, index, list);
        }

        @Override
        public boolean onItemImageLongClick(Context context, ImageView imageView, int index, List<String> list) {
            Toast.makeText(context, "长按了图片" + index, Toast.LENGTH_LONG).show();
            return super.onItemImageLongClick(context, imageView, index, list);
        }
    };
}
