package com.example.board.repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;

import com.example.board.model.Article;
import com.example.board.service.ApiService;

@Repository
public class ArticleRepository {

    private static final String API_ARTICLE = "http://localhost:8020/article";
    private final ApiService<Article, List<Article>> apiService;

    public ArticleRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<Article> getArticles() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return apiService.getArticles(API_ARTICLE.concat("/"), headers).getBody();
    }

}
