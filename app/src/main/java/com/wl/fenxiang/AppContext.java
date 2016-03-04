package com.wl.fenxiang;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;

/**
 * Created by Administrator on 2016/3/3 0003.
 */
public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        //微信 appid appsecret
        PlatformConfig.setSinaWeibo("3921700954","04b48b094faeb16683c32669824ebdad");
        //新浪微博 appkey appsecret
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        // QQ和Qzone appid appkey
        PlatformConfig.setAlipay("2015111700822536");
        //支付宝 appid
        PlatformConfig.setYixin("yxc0614e80c9304c11b0391514d09f13bf");
        //易信 appkey
//        PlatformConfig.setRenren("201874","28401c0964f04a72a14c812d6132fcef","3bf66e42db1e4fa9829b955cc300b737");
        //人人 appid appkey appsecret
        PlatformConfig.setTwitter("3aIN7fuF685MuZ7jtXkQxalyi", "MK6FEYG63eWcpDFgRYw4w9puJhzDl0tyuqWjZ3M7XJuuG7mMbO");
        //Twitter appid appkey
        PlatformConfig.setPinterest("1439206");
        //Pinterest appid
        PlatformConfig.setLaiwang("laiwangd497e70d4", "d497e70d4c3e4efeab1381476bac4c5e");
        //来往 appid appkey
    }
}
