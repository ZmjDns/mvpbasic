package com.zmj.mvpbasic.mvp.model;

import com.jess.arms.integration.RepositoryManager;
import com.zmj.mvpbasic.mvp.entry.User;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Zmj
 * @date 2018/11/16
 * 在Model中通过RepositoryManager#obtainRetrofitService() 或
 * RepositoryManager#obtainCacheService() 使用IServer包中的这些服务
 */
public class TestIservice {
    RepositoryManager mRepositoryManager;



//    public Observable<List<User>> getUsers(int lastIdQueried,boolean update){
//       //Observable<List<User>> users =mRepositoryManager.obtainRetrofitService(UserService.class)
//    }
}
