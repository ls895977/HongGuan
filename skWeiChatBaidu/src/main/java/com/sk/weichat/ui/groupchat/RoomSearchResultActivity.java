package com.sk.weichat.ui.groupchat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.sk.weichat.ui.base.BaseActivity;
import com.yujianni.app.R;

public class RoomSearchResultActivity extends BaseActivity {

    public static void start(Context ctx, String keyWord) {
        Intent intent = new Intent(ctx, RoomSearchResultActivity.class);
        intent.putExtra("roomName", keyWord);
        ctx.startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_search_result);
        getSupportActionBar().hide();
        TextView mTvTitle = findViewById(R.id.tv_title_center);
        mTvTitle.setText(getString(R.string.group));
        findViewById(R.id.iv_title_left).setOnClickListener(v -> finish());
    }
}
