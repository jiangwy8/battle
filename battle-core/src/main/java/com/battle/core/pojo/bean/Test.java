package com.battle.core.pojo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.battle.core.enums.StatusEnum;

/**
 * 描述：
 *
 * @ClassName Test
 * @Author jiangwy
 * @Date 2020/6/13 16:58
 **/
@TableName(value = "test")//指定表名
public class Test extends Base {
    private String name;
    private String code;
    private String message;
    private StatusEnum status;
}
