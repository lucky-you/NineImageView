package com.zhowin.nineimageview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.zhowin.nineimage.adapter.NineGridImageViewAdapter;
import com.zhowin.nineimage.view.NineGroupImageView;
import com.zhowin.nineimage.view.RoundImageView;
import com.zhowin.nineimageview.R;
import com.zhowin.nineimageview.model.NineImageList;

import java.util.List;


/**
 * author      : Z_B
 * date       : 2018/3/7
 * function  :
 */
public class NineGridViewImageAdapter extends RecyclerView.Adapter<NineGridViewImageAdapter.ImageViewHolder> {

    private List<NineImageList> imageList;
    private Context mContent;

    public NineGridViewImageAdapter(List<NineImageList> imageList, Context mContent) {
        this.imageList = imageList;
        this.mContent = mContent;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImageViewHolder(View.inflate(mContent, R.layout.include_nine_image_item_view, null));
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder {
        private NineGroupImageView<String> nineImageContent;
        private TextView tvContent;

        public ImageViewHolder(View itemView) {
            super(itemView);
            nineImageContent = itemView.findViewById(R.id.nineGridView);
            tvContent = itemView.findViewById(R.id.tvContent);
            nineImageContent.setAdapter(mAdapter);
        }

        public void bind(int position) {
            nineImageContent.setImagesData(imageList.get(position).getImageList());
            tvContent.setText(imageList.get(position).getTitle());
        }
    }

    private NineGridImageViewAdapter<String> mAdapter = new NineGridImageViewAdapter<String>() {
        @Override
        public void onDisplayImage(Context context, ImageView imageView, String s) {
            Glide.with(mContent).load(s).into(imageView);
        }

        @Override
        public ImageView createImageView(Context context) {
            //不使用默认的图片
            RoundImageView roundImageView = new RoundImageView(mContent);
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
