package com.ei.demo.resolver;

import com.ei.demo.dto.AuthorDto;
import com.ei.demo.service.AuthorService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public List<AuthorDto> getAuthors() {
        return authorService.getAuthors();
    }

}
