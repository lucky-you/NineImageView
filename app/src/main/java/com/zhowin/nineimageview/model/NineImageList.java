package com.zhowin.nineimageview.model;

import java.util.List;

/**
 * author      : Z_B
 * date       : 2019/4/4
 * function  :
 */
public class NineImageList {

    private String title;
    private List<String> imageList;

    public NineImageList(String title, List<String> imageList) {
        this.title = title;
        this.imageList = imageList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }
}
