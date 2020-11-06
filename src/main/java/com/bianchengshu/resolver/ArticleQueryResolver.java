package com.ei.demo.resolver;

import com.ei.demo.core.exception.ServiceException;
import com.ei.demo.core.result.ResultEnum;
import com.ei.demo.dto.ArticleDto;
import com.ei.demo.service.ArticleService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ArticleService articleService;

    public List<ArticleDto> getArticles() {
        return articleService.getArticles();
    }

    public ArticleDto getArticleById(Long id) {
        //throw new ServiceException(ResultEnum.SYS_NET_WORK_ERROR);
        return articleService.getArticleById(id);
    }
}
