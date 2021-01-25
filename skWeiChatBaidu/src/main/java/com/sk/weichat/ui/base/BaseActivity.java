package com.sk.weichat.ui.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sk.weichat.MyApplication;
import com.sk.weichat.util.LocaleHelper;
import com.umeng.analytics.MobclickAgent;
import com.yujianni.app.R;

public abstract class BaseActivity extends BaseLoginActivity {

    private View swipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LocaleHelper.setLocale(this, LocaleHelper.getLanguage(this));
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);// 竖屏
        swipeBackLayout = this.getSwipeBackLayout();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    /**
     * 戳一戳动画
     *
     * @param type
     */
    public void shake(int type) {
        if (swipeBackLayout != null) {
            Animation shake;
            if (type == 0) {
                shake = AnimationUtils.loadAnimation(MyApplication.getContext(), R.anim.shake_from);
            } else {
                shake = AnimationUtils.loadAnimation(MyApplication.getContext(), R.anim.shake_to);
            }
            swipeBackLayout.startAnimation(shake);
        }
    }
}
