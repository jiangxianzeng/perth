package com.bianchengshu.service;



import com.bianchengshu.dto.ArticleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {
    public List<ArticleDto> getArticles();

    public ArticleDto getArticleById(Long id);
}
