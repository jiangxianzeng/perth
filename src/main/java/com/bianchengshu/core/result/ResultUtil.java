package com.bianchengshu.core.result;

/**
 * Created by jiangxianzeng on 17/11/29.
 */
public class ResultUtil {

    /*
    * 返回成功, 传入返回具体参数
    * */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(object);

        return result;
    }

    /*
    * 提供给部分不需要出参的接口
    * */
    public static Result success() {
        return success(null);
    }

    /*
    * 自定义错误信息
    * */
    public static Result error(Integer code, String message) {

        Result result =  new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);

        return result;
    }

    /*
    * 返回异常信息,在已知的范围内
    * */

    public static Result error(ResultEnum resultEnum) {

        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        result.setData(null);

        return result;

    }
}
