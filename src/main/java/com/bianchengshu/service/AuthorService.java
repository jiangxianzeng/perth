package com.bianchengshu.service;


import com.bianchengshu.dto.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    public List<AuthorDto> getAuthors();

    public AuthorDto getAuthorById(Long authorId);
}
