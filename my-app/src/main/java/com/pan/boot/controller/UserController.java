package com.pan.boot.controller;

import com.pan.boot.common.result.BaseResponse;
import com.pan.boot.common.result.ResultVo;
import com.pan.boot.model.dto.UserLoginDTO;
import com.pan.boot.model.entity.User;
import com.pan.boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 16:36
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/list")
    @ApiOperation("获取用户列表")
    public BaseResponse<List<User>> getUserList() {
        List<User> userList = userService.getUserList();

        return ResultVo.success(userList);
    }

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public BaseResponse<User> login(@Validated @RequestBody UserLoginDTO userLoginDTO) {
        return ResultVo.success(new User());
    }
}
