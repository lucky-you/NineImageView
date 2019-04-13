package com.zhowin.nineimageview.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhowin.nineimageview.R;
import com.zhowin.nineimageview.model.SecondList;

import java.util.List;

/**
 * author      : Z_B
 * date       : 2019/4/13
 * function  :第三方RecyclerViewAdapter
 */
public class ThreeListAdapter extends BaseQuickAdapter<SecondList, BaseViewHolder> {

    public ThreeListAdapter(@Nullable List<SecondList> data) {
        super(R.layout.include_second_item_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SecondList item) {
        helper.setText(R.id.tvTitle, item.getTitle());
        RecyclerView imageRecyclerView = helper.getView(R.id.imageRecyclerView);
        NIneViewListAdapter nineGridViewImageAdapter = new NIneViewListAdapter(item.getList());
        imageRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        imageRecyclerView.setAdapter(nineGridViewImageAdapter);
    }
}
