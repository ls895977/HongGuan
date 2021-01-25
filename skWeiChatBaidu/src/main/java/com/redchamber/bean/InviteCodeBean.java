package com.redchamber.bean;

import java.util.List;


public class InviteCodeBean {

    public String inviteCode;
    public String inviteNum;
    public List<InviteUser> userInvites;

    public class InviteUser {
        public String nickname;
        public String userId;
        public long createTime;
    }

}
