package com.bianchengshu.core.exception;

import com.bianchengshu.core.result.ResultEnum;
import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangxianzeng on 17/11/27.
 */
public class ServiceException extends RuntimeException implements GraphQLError {

    private  Integer code;

    /*
    * 继承exception,加入错误状态值
    * */
    public ServiceException (ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    /*
    * 自定义错误信息
    * */
    public ServiceException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Collections.singletonMap("code", code);
    }


}
