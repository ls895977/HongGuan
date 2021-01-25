package com.redchamber.bean;

import java.util.List;

public class BaiduBeautyBean {

    public BaiduBeautyBean.Result result;

    public static class Result {

        public int face_num;
        public List<BaiduBeautyBean.Result.Face> face_list;

        public static class Face {

            public float beauty;



        }
    }
}
