package com.fanjun.keeplive.getui;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;

import com.heytap.msp.push.HeytapPushManager;

public class GetuiPushService extends com.igexin.sdk.PushService{

    private static Handler handler = new Handler();
    private Runnable sRunnable=new RequestNotificationRunnable();
    protected static class RequestNotificationRunnable implements Runnable {
        @Override
        public void run() {
            String regId = HeytapPushManager.getRegisterID();
            if (TextUtils.isEmpty(regId)) {
                handler.postDelayed(this, 2000);
            } else {
                HeytapPushManager.requestNotificationPermission();
            }
        }
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        HeytapPushManager.init(getApplicationContext(), false);
        if (HeytapPushManager.isSupportPush()){
            handler.postDelayed(sRunnable,1000);
        }
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

}
