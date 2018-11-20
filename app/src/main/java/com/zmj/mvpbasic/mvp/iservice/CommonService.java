package com.zmj.mvpbasic.mvp.iservice;

import com.zmj.mvpbasic.mvp.entry.User;

import java.util.List;
import java.util.Observable;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * @author Zmj
 * @date 2018/11/16
 * RepositoryManager 用来管理网络请求层，以及数据缓存层，
 */
public interface CommonService {
    String HEADER_API_VERSION = "Accept: application/vnd.github.v3+json";

    @Headers({HEADER_API_VERSION})
    @GET("/users")
    io.reactivex.Observable<List<User>> getUsers(@Query("since") int lastIdQueried,@Query("per_page") int perPage);
}
