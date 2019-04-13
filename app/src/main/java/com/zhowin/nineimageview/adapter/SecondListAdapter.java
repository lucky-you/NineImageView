package com.zhowin.nineimageview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhowin.nineimageview.R;
import com.zhowin.nineimageview.model.SecondList;

import java.util.List;

/**
 * author      : Z_B
 * date       : 2019/4/11
 * function  :
 */
public class SecondListAdapter extends RecyclerView.Adapter<SecondListAdapter.ViewHolder> {


    private List<SecondList> dateList;
    private Context mContext;

    public SecondListAdapter(List<SecondList> data, Context mContext) {
        this.dateList = data;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(View.inflate(mContext, R.layout.include_second_item_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        RecyclerView imageRecyclerView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            imageRecyclerView = itemView.findViewById(R.id.imageRecyclerView);
        }

        public void bind(int position) {
            tvTitle.setText(dateList.get(position).getTitle());
            NineGridViewImageAdapter nineGridViewImageAdapter = new NineGridViewImageAdapter(dateList.get(position).getList(), mContext);
            imageRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
            imageRecyclerView.setAdapter(nineGridViewImageAdapter);
        }
    }

}
