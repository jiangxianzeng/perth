package com.ei.demo.resolver;

import com.ei.demo.dto.CommentDto;
import com.ei.demo.service.CommentService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private CommentService commentService;

    public List<CommentDto> getComments() {
       return commentService.getComments();
    }

}
