package com.bianchengshu.core.exception;

import com.bianchengshu.core.result.ResultEnum;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.kickstart.execution.error.GraphQLErrorHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class CustomGraphqlException implements GraphQLErrorHandler {
    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> errors) {
        return errors.stream().map(this::getNested).collect(Collectors.toList());
    }
    private GraphQLError getNested(GraphQLError error) {
        if (error instanceof ExceptionWhileDataFetching) {
            ExceptionWhileDataFetching exceptionError = (ExceptionWhileDataFetching) error;
            if (exceptionError.getException() instanceof ServiceException) {
                return (GraphQLError) exceptionError.getException();
            }
        }
        log.error("GraphQL Exception, Path: {}, Error: {}", error.getPath(), error.getMessage());
        return new ServiceException(ResultEnum.UNKNOW_ERROR);
    }
}
