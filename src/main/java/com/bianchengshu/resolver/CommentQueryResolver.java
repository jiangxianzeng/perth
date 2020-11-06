package com.bianchengshu.resolver;

import com.bianchengshu.dto.CommentDto;
import com.bianchengshu.service.CommentService;
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
