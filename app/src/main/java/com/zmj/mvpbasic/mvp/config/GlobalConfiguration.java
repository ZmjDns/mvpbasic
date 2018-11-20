package com.zmj.mvpbasic.mvp.config;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.jess.arms.base.delegate.AppLifecycles;
import com.jess.arms.di.module.GlobalConfigModule;
import com.jess.arms.integration.ConfigModule;

import java.io.File;
import java.util.List;

/**
 * @author Zmj
 * @date 2018/11/16
 * app全局配置信息（使用Dagger注入）
 */
public class GlobalConfiguration implements ConfigModule {
    @Override
    public void applyOptions(Context context, GlobalConfigModule.Builder builder) {
        //使用Builder可以为框架配置一些配置信息
        builder.baseurl(Api.DOMAIN)
                .cacheFile(new File("cache"));

    }

    @Override
    public void injectAppLifecycle(Context context, List<AppLifecycles> lifecycles) {
        //向application的生命周期注入一些自定义逻辑

    }

    @Override
    public void injectActivityLifecycle(Context context, List<Application.ActivityLifecycleCallbacks> lifecycles) {
        //向Activity的生命周期注入一些自定义逻辑

    }

    @Override
    public void injectFragmentLifecycle(Context context, List<FragmentManager.FragmentLifecycleCallbacks> lifecycles) {
        //向Fragment的生命周期注入一些自定义逻辑
    }
}
