package com.ei.demo.resolver;


import com.ei.demo.dto.AuthorDto;
import com.ei.demo.dto.CommentDto;
import com.ei.demo.service.AuthorService;
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
