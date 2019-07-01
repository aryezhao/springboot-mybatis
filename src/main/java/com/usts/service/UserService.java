package com.usts.service;


import com.usts.bean.User;

import java.util.List;

/**
 * Created by lenovo on 2019/7/1.
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
