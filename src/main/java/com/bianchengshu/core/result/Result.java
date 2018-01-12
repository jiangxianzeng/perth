package com.bianchengshu.core.result;


/**
 * Created by jiangxianzeng on 17/11/27.
 */
public class Result<T> {
    private Integer code;

    private String message;

    private T data;

    public Result() {
    }

    public Result(ResultEnum resultEnum, T data) {
        this(resultEnum);
        this.data = data;
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + code +
                ", msg='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
