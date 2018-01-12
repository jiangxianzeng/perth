package com.bianchengshu.core.exception;

import com.bianchengshu.core.result.Result;
import com.bianchengshu.core.result.ResultEnum;
import com.bianchengshu.core.result.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiangxianzeng on 17/11/29.
 */

@ControllerAdvice
public class DefaultExceptionHandler {

    /*
    * 判断错误是否是已定义的已知错误,不是则由未知错误代替,同时记录在Log中.
    * */

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result doDefaultException(HttpServletRequest req, Exception e) {
        if (e instanceof ServiceException) {
            ServiceException serviceException =  (ServiceException) e;
            return ResultUtil.error(serviceException.getCode(), serviceException.getMessage());
        }

        //LOGGER.error("[系统异常] {}", e);
        return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
    }
}
