package com.pan.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageInfo<User> userPage(Integer pagenum, Integer pagesize) {
        /*设置从第pagenum页开始, 页大小为pageSize*/
        PageHelper.startPage(pagenum, pagesize);

        /*startPage后紧跟的查询就是一个分页查询, pagehelper会拦截sql, 在查询所有书的sql末尾加上 limit语句, 所以mapper.xml的sql语句不能加分号*/

        /*正常的查询所有的方法*/
        List<User> userList = userMapper.getUserList();

        /*传入查询所有的数据*/
        /*使用pageInfo来包装查询后的结果*/
        /*pageInfo中封装了详细的信息*/
        PageInfo<User> userPage = new PageInfo<>(userList);

        return userPage;
    }
}
