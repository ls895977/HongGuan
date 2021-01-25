package com.redchamber.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserHomePageBean {

    public String nickname;
    public String ageConstellation;
    public String residentCity;
    public String userId;
    public String userLevel;
    public int height;
    public int weight;
    public String program;
    public String position;
    public String description;
    public String expectFriend;
    public String programId;
    public int collectStatus;//1已收藏 0 未收藏
    public int lianMaiFlag; //允许不允许对我发起连麦 0不允许 1允许
    public int lianMaiGold;
    public double lng;// longitude  经度
    public double lat;// latitude   纬度
    /**
     * 私聊所需糖果
     */
    public int privateChatGold;
    public UserAlbumVo userAlbumVo;
    /**
     * onlinestate : 在线
     * registerCity : 上海市
     * showBadge : 1
     * userAlbumVo : {"coin":0,"createTime":1599883578101,"photoNum":0,"photos":[],"type":0,"userId":10000934}
     * userId : 10000934
     */

    public String onlinestate;
    public String registerCity;
    public int showBadge;

    public static class UserAlbumVo {
        public int photoNum;
        public int coin;
        public int type;//相册类型，0公开 1申请访问 2付费
        public int lockFlag; //0未解锁 1已解锁 2已发送照片，等待审核
        public String userId;
        public List<PhotoBean> photos;
    }
}
