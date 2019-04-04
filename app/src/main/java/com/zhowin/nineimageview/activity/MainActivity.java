package com.zhowin.nineimageview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zhowin.nineimageview.R;
import com.zhowin.nineimageview.adapter.NineGridViewImageAdapter;
import com.zhowin.nineimageview.model.NineImageList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NineGridViewImageAdapter nineGridViewImageAdapter;
    List<NineImageList> nineImageLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDates();
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);

        nineGridViewImageAdapter = new NineGridViewImageAdapter(nineImageLists, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(nineGridViewImageAdapter);

    }

    private void initDates() {
        nineImageLists.add(new NineImageList("1张图片", Arrays.asList(
                "https://pic3.zhimg.com/d1750bd47b514ad62af9497bbe5bb17e_xll.jpg"
        )));
        nineImageLists.add(new NineImageList("3张图片", Arrays.asList(
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic1.zhimg.com/76903410e4831571e19a10f39717988c_xll.png",
                "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg"
        )));
        nineImageLists.add(new NineImageList("4张图片", Arrays.asList(
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic1.zhimg.com/76903410e4831571e19a10f39717988c_xll.png",
                "https://pic1.zhimg.com/76903410e4831571e19a10f39717988c_xll.png",
                "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg"
        )));
        nineImageLists.add(new NineImageList("5张图片", Arrays.asList(
                "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg",
                "https://pic4.zhimg.com/52e093cbf96fd0d027136baf9b5cdcb3_xll.png",
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic3.zhimg.com/0c149770fc2e16f4a89e6fc479272946_xll.jpg",
                "https://pic3.zhimg.com/f6dc1c1cecd7ba8f4c61c7c31847773e_xll.jpg"
        )));
        nineImageLists.add(new NineImageList("7张图片", Arrays.asList(
                "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg",
                "https://pic4.zhimg.com/52e093cbf96fd0d027136baf9b5cdcb3_xll.png",
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic3.zhimg.com/0c149770fc2e16f4a89e6fc479272946_xll.jpg",
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg",
                "https://pic3.zhimg.com/f6dc1c1cecd7ba8f4c61c7c31847773e_xll.jpg"
        )));
        nineImageLists.add(new NineImageList("9张图片", Arrays.asList(
                "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg",
                "https://pic4.zhimg.com/52e093cbf96fd0d027136baf9b5cdcb3_xll.png",
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic3.zhimg.com/0c149770fc2e16f4a89e6fc479272946_xll.jpg",
                "https://pic3.zhimg.com/f6dc1c1cecd7ba8f4c61c7c31847773e_xll.jpg",
                "https://pic4.zhimg.com/fc04224598878080115ba387846eabc3_xll.jpg",
                "https://pic3.zhimg.com/d1750bd47b514ad62af9497bbe5bb17e_xll.jpg",
                "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
                "https://pic3.zhimg.com/0c149770fc2e16f4a89e6fc479272946_xll.jpg"
        )));
    }

}
