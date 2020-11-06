package com.bianchengshu.resolver;

import com.bianchengshu.dto.ArticleDto;
import com.bianchengshu.dto.AuthorDto;
import com.bianchengshu.dto.CommentDto;
import com.bianchengshu.service.AuthorService;
import com.bianchengshu.service.CommentService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleResolver implements GraphQLResolver<ArticleDto> {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private CommentService commentService;

    public AuthorDto getAuthor(ArticleDto articleDto) {
        System.out.printf("get author........authorId: %d\n", articleDto.getAuthorId());
        return authorService.getAuthorById(articleDto.getAuthorId());
    }

    public List<CommentDto> getComments(ArticleDto articleDto) {
        System.out.printf("get comments........article Id: %d\n", articleDto.getId());
        return commentService.getCommentsByArticleId(articleDto.getId());
    }
}
