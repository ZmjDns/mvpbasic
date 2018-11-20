package com.zmj.mvpbasic.mvp.iservice;

import com.zmj.mvpbasic.mvp.entry.User;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.Reply;

/**
 * @author Zmj
 * @date 2018/11/16
 */
public interface CommonCache {
    @LifeCache(duration = 2,timeUnit = TimeUnit.MINUTES)
    Observable<Reply<User>> getUsers(Observable<List<User>> oUsers, DynamicKey idLastUserQueried, EvictProvider evictProvider);
}
