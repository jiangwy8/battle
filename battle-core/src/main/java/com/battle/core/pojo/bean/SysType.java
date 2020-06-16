package com.battle.core.pojo.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 描述：
 *
 * @ClassName SysType
 * @Author jiangwy
 * @Date 2020/6/6 20:57
 **/
@Data
public class SysType {
    @ApiModelProperty(value = "主键ID")
    private Long id;
    @ApiModelProperty(value = "字段")
    private String field;
    @ApiModelProperty(value = "名称")
    private String name;
    @ApiModelProperty(value = "描述")
    private String description;


}
