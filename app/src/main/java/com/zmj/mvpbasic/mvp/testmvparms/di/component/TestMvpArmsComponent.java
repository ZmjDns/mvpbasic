package com.zmj.mvpbasic.mvp.testmvparms.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.zmj.mvpbasic.mvp.testmvparms.di.module.TestMvpArmsModule;

import com.jess.arms.di.scope.ActivityScope;
import com.zmj.mvpbasic.mvp.testmvparms.ui.activity.TestMvpArmsActivity;

@ActivityScope
@Component(modules = TestMvpArmsModule.class, dependencies = AppComponent.class)
public interface TestMvpArmsComponent {
    void inject(TestMvpArmsActivity activity);
}