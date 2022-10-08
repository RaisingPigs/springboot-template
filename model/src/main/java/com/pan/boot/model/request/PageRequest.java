package com.pan.boot.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: Mr.Pan
 * @create: 2022-10-08 15:50
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("分页对象")
public class PageRequest {
    @ApiModelProperty(value = "页码", required = true, example = "1")
    private int pagenum = 1;
    @ApiModelProperty(value = "每页几条数据", required = true, example = "5")
    private int pagesize = 5;
    @ApiModelProperty(value = "搜索关键字",required = true, example = "张三")
    private String keyword;
}
