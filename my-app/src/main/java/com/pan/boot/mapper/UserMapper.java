package com.pan.boot.mapper;

import com.pan.boot.model.entity.User;

import java.util.List;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 16:27
 **/
public interface UserMapper {
    List<User> getUserList();
}
