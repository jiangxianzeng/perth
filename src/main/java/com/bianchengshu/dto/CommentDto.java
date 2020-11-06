package com.bianchengshu.dto;

import lombok.Data;

@Data
public class CommentDto {
    private Long id;

    private String text;

    private Long authorId;
}
