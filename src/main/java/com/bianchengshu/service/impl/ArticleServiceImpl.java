package com.bianchengshu.service.impl;


import com.bianchengshu.dto.ArticleDto;
import com.bianchengshu.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Override
    public List<ArticleDto> getArticles() {
        List<ArticleDto> articleDtos = new ArrayList<>();

        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthorId(1L);
        articleDto.setId(1L);
        articleDto.setTitle("This is a title.");
        articleDto.setText("This is a Text.");

        articleDtos.add(articleDto);
        return articleDtos;
    }

    @Override
    public ArticleDto getArticleById(Long Id) {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setAuthorId(1L);
        articleDto.setId(Id);
        articleDto.setTitle("This is a title.");
        articleDto.setText("This is a Text.");
        return articleDto;
    }
}
