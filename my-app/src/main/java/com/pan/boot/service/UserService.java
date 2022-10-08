package com.pan.boot.service;

import com.github.pagehelper.PageInfo;
import com.pan.boot.model.entity.User;

import java.util.List;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 16:35
 **/
public interface UserService {
    List<User> getUserList();

    PageInfo<User> userPage(Integer pagenum, Integer pagesize);
}
