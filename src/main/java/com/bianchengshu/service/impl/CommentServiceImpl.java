package com.bianchengshu.service.impl;

import com.bianchengshu.dto.CommentDto;
import com.bianchengshu.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {


    @Override
    public List<CommentDto> getComments() {
        List<CommentDto> commentDtoList = new ArrayList<>();
        CommentDto commentDto = new CommentDto();

        commentDto.setAuthorId(1L);
        commentDto.setId(1L);
        commentDto.setText("this is comment text.");

        commentDtoList.add(commentDto);
        return commentDtoList;
    }

    @Override
    public List<CommentDto> getCommentsByArticleId(Long articleId) {

        List<CommentDto> commentDtoList = new ArrayList<>();
        CommentDto commentDto = new CommentDto();

        commentDto.setAuthorId(1L);
        commentDto.setId(1L);
        commentDto.setText("this is comment text2.");

        commentDtoList.add(commentDto);
        return commentDtoList;
    }
}
