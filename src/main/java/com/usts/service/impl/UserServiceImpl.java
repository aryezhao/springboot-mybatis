package com.usts.service.impl;

import com.usts.bean.User;
import com.usts.mapper.UserMapper;
import com.usts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2019/7/1.
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 注入Mappper接口代理对象
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        List<User> list = userMapper.findAll();
        return list;
    }
}
