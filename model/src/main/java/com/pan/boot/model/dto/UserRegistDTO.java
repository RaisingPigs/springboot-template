package com.pan.boot.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-07 14:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistDTO implements Serializable {
    private static final long serialVersionUID = 4953613453096929692L;
    
    @ApiModelProperty(value = "用户名", required = true, example = "1234567")
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "密码", required = true, example = "abcdef")
    @NotEmpty(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "确认密码", required = true, example = "abcdef")
    @NotEmpty(message = "确认密码不能为空")
    private String checkPassword;
}
