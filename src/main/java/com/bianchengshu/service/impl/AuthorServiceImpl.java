package com.bianchengshu.service.impl;


import com.bianchengshu.dto.AuthorDto;
import com.bianchengshu.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {


    @Override
    public List<AuthorDto> getAuthors() {
        List<AuthorDto> authorDtoList = new ArrayList<>();
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(1L);
        authorDto.setUsername("Maloc");
        authorDto.setBio("12345");

        authorDtoList.add(authorDto);
        return authorDtoList;
    }

    @Override
    public AuthorDto getAuthorById(Long authorId) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(1L);
        authorDto.setUsername("Maloc");
        authorDto.setBio("12345");
        return authorDto;
    }
}
