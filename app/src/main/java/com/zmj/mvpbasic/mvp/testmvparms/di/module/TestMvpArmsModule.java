package com.zmj.mvpbasic.mvp.testmvparms.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.zmj.mvpbasic.mvp.testmvparms.contract.TestMvpArmsContract;
import com.zmj.mvpbasic.mvp.testmvparms.model.TestMvpArmsModel;


@Module
public class TestMvpArmsModule {
    private TestMvpArmsContract.View view;

    /**
     * 构建TestMvpArmsModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public TestMvpArmsModule(TestMvpArmsContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    TestMvpArmsContract.View provideTestMvpArmsView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    TestMvpArmsContract.Model provideTestMvpArmsModel(TestMvpArmsModel model) {
        return model;
    }
}