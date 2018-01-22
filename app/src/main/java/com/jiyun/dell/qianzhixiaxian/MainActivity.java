package com.jiyun.dell.qianzhixiaxian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent("com.jiyun.dell.qianzhixiaxian.FORCE_OFFLINE");
        sendBroadcast(intent);
    }
}
