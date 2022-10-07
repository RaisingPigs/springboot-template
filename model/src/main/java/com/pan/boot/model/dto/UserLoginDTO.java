package com.pan.boot.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 13:54
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户登录DTO")
public class UserLoginDTO implements Serializable{
    private static final long serialVersionUID = 5629446209324754377L;
    
    @ApiModelProperty(value = "用户名", required = true, example = "1234567")
    @NotEmpty(message = "用户名不能为空")
    private String username;
    
    @ApiModelProperty(value = "密码", required = true, example = "abcdefg")
    @NotEmpty(message = "密码不能为空")
    private String password;
}
