package com.qf.wyg.consumer.dao;

import com.qf.wyg.consumer.entity.E_User;

/**
 * 用户接口
 */
public interface IUserDao {
    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean register(E_User user);

    /**
     * 判定用户是否存在
     * @param user
     * @return
     */
    boolean findUser(E_User user);

}
