package com.bianchengshu.service;


import com.bianchengshu.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    public List<CommentDto> getComments();

    public List<CommentDto> getCommentsByArticleId(Long articleId);
}
