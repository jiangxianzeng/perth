package com.bianchengshu.core.result;

/**
 * Created by jiangxianzeng on 17/11/29.
 */
public enum ResultEnum {

    SUCCESS(0, "success"),
    UNKNOW_ERROR(-1, "未知错误"),
    NET_WORK_ERROR(-2, "网络异常，请稍后重试"),
    PASSWORD_ERROR(10001, "用户名或密码错误"),
    PARAMETER_ERROR(10101, "参数错误");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
