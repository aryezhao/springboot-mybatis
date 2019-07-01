package com.usts.service.impl;

import com.usts.bean.User;
import com.usts.mapper.UserMapper;
import com.usts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

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

    /**
     * 注入Redis集群对象
     */
    @Autowired
    private JedisCluster jedisCluster;

    /**
     * 测试Redis缓存
     * @return
     */
    //@Cacheable(value = "findAll")
    public List<User> findAll() {
        System.out.println("如何第二次没有打印此文字，说明走了缓存，没有执行此方法！");
        List<User> list = userMapper.findAll();
        return list;
    }


    public String findRedis(){
        jedisCluster.set("username","兴业银行");
        String value = jedisCluster.get("username");
        return value;
    }
}
