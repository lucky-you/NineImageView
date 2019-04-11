package com.zhowin.nineimageview.model;

import java.util.List;

/**
 * author      : Z_B
 * date       : 2019/4/11
 * function  :
 */
public class SecondList {

    private String title;
    private List<NineImageList> list;

    public SecondList(String title, List<NineImageList> list) {
        this.title = title;
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<NineImageList> getList() {
        return list;
    }

    public void setList(List<NineImageList> list) {
        this.list = list;
    }
}
