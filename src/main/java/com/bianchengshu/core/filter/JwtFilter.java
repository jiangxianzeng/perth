package com.bianchengshu.core.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/*
*  过滤器
* */

@Component
public class JwtFilter extends OncePerRequestFilter {

    /**
     * 存放Token的Header Key
     */
    public static final String AUTH_HEADER_STRING = "Authorization";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
                                                                                throws ServletException, IOException {
        Optional<HttpServletRequest> optReq = Optional.of(request);

        String authToken = optReq.map(req -> req.getHeader(AUTH_HEADER_STRING)).filter(token -> !token.isEmpty())
                .map(token -> token.replace("Bearer ", "")).orElse(null);

        if (authToken != null && !authToken.isEmpty()) {
            System.out.printf("JwtFilter.....token: %s\n", authToken);
        } else {
            System.out.println("JwtFilter.....token is null.");
        }
        chain.doFilter(request, response);
    }
}
