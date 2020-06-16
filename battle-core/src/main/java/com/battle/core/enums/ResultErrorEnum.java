package com.battle.core.enums;

/**
 * 描述：
 *
 * @ClassName ResultErrorEnum
 * @Author jiangwy
 * @Date 2020/6/6 15:42
 **/
public enum ResultErrorEnum {
    //成功
    SUCCESS(200, "成功!"),

    //系统
    ERRMSG_SYSTEM(10000, "未知错误，请稍后再试"),
    ERRMSG_NODATA(10001, "没有数据"),
    ERRMSG_DUPLICATE(10002, "有重复数据存在"),

    // Authorize
    ERRMSG_AUTHORITY(14011, "拒绝访问"),
    ERRMSG_NO_API_AUTHORITY(14012, "没有权限"),
    ERRMSG_FILETYPE(14102, "不支持的文件类型");

    private Integer code;
    private String msg;
    ResultErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
