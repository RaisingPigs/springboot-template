package com.pan.boot.service.impl;

import com.pan.boot.mapper.UserMapper;
import com.pan.boot.model.entity.User;
import com.pan.boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 16:35
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
