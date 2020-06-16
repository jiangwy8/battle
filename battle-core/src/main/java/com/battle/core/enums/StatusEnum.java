package com.battle.core.enums;

/**
 * 描述：
 *
 * @ClassName StatusEnum
 * @Author jiangwy
 * @Date 2020/6/13 17:29
 **/
public enum  StatusEnum implements DBEnum {
    NEW(1,"新建"),
    APPROVE(2,"审核通过");

    private int code;
    private String name;
    StatusEnum(int code,String name){
        this.code=code;
        this.name=name;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
}
