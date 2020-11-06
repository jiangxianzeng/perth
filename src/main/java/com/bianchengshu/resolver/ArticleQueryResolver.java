package com.bianchengshu.resolver;

import com.bianchengshu.dto.ArticleDto;
import com.bianchengshu.service.ArticleService;
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
