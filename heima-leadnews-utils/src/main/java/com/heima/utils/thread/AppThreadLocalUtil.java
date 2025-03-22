package com.heima.utils.thread;

import com.heima.model.user.pojos.ApUser;

public class AppThreadLocalUtil {

    private final static ThreadLocal<ApUser> APP_USER_THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 添加用户
     * @param apUser
     */
    public static void  setUser(ApUser apUser){
        APP_USER_THREAD_LOCAL.set(apUser);
    }

    /**
     * 获取用户
     */
    public static ApUser getUser(){
        return APP_USER_THREAD_LOCAL.get();
    }

    /**
     * 清理用户
     */
    public static void clear(){
        APP_USER_THREAD_LOCAL.remove();
    }
}