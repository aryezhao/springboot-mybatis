package com.usts.mapper;

import com.usts.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by lenovo on 2019/7/1.
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
