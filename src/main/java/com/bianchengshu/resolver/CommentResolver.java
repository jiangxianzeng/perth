package com.bianchengshu.resolver;


import com.bianchengshu.dto.AuthorDto;
import com.bianchengshu.dto.CommentDto;
import com.bianchengshu.service.AuthorService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CommentResolver implements GraphQLResolver<CommentDto> {

    @Autowired
    private AuthorService authorService;

    public AuthorDto getAuthor(CommentDto commentDto) {
        return authorService.getAuthorById(commentDto.getAuthorId());
    }

}
