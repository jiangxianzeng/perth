package com.ei.demo.resolver;

import com.ei.demo.dto.ArticleDto;
import com.ei.demo.dto.AuthorDto;
import com.ei.demo.dto.CommentDto;
import com.ei.demo.service.AuthorService;
import com.ei.demo.service.CommentService;
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
