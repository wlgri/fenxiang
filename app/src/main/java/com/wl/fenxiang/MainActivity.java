package com.wl.fenxiang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.bean.SHARE_MEDIA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclick(View v){
        final SHARE_MEDIA[] displaylist = new SHARE_MEDIA[]
                {
                        SHARE_MEDIA.WEIXIN, SHARE_MEDIA.WEIXIN_CIRCLE,SHARE_MEDIA.SINA,
                        SHARE_MEDIA.QQ, SHARE_MEDIA.QZONE,SHARE_MEDIA.DOUBAN
                };
        new ShareAction(this).setDisplayList(displaylist)
                .withText("呵呵")
                .withTitle("title")
                .withTargetUrl("http://www.baidu.com")
                .open();
    }
}
