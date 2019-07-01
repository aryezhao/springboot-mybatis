package com.usts.controller;

import com.usts.bean.User;
import com.usts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lenovo on 2019/7/1.
 */
@RestController
public class UserController {

    ///**
    // * 需求：返回基本类型json格式数据
    // * @return
    // */
    //@RequestMapping("hello")
    //public String showHello(){
    //    return "hello springboot";
    //}
    //
    ///**
    // * 需求：返回POJO对象
    // * @return
    // */
    //@RequestMapping("pojo")
    //public Users showUser(){
    //    Users user = new Users();
    //    user.setId(10001);
    //    user.setUsername("张三");
    //    user.setSex("男");
    //    user.setBirthday(new Date());
    //    user.setAddress("浦东");
    //    return user;
    //}
    //
    ///**
    // * 需求：返回Map集合对象
    // * @return
    // */
    //@RequestMapping("maps")
    //public Map<String,Object> showMaps(){
    //
    //    Map<String,Object> maps = new HashMap<>();
    //    maps.put("username","张三");
    //    maps.put("id",100002);
    //    maps.put("password","0000");
    //    maps.put("birthday",new Date());
    //    maps.put("address","上海浦东");
    //    return maps;
    //}
    //
    ///**
    // * 需求：返回Map集合对象
    // * @return
    // */
    //@RequestMapping("list")
    //public List<Users> showList(){
    //
    //    List<Users> list = new ArrayList<>();
    //    Users user = new Users();
    //    user.setId(10001);
    //    user.setUsername("张三");
    //    user.setSex("男");
    //    user.setBirthday(new Date());
    //    user.setAddress("浦东");
    //
    //    Users user1 = new Users();
    //    user1.setId(10001);
    //    user1.setUsername("张三");
    //    user1.setSex("男");
    //    user1.setBirthday(new Date());
    //    user1.setAddress("浦东");
    //
    //    list.add(user);
    //    list.add(user1);
    //
    //    return list;
    //}

    //注入service服务对象
    @Autowired
    private UserService userService;

    /**
     * 整合mybatis
     * @return
     */
    //@RequestMapping("find")
    public List<User> findAll(){
        List<User> list = userService.findAll();

        return list;
    }

    /**
     * 整合mybatis
     * @return
     */
    @RequestMapping("redis")
    public String findRedis(){
        String redis = userService.findRedis();
        return redis;
    }
}
