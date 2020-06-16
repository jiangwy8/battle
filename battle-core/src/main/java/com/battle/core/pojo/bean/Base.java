package com.battle.core.pojo.bean;

import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/**
 * 描述：
 *
 * @ClassName Base
 * @Author jiangwy
 * @Date 2020/6/13 16:58
 **/
public class Base {
    @TableId
    private Long id;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
}
