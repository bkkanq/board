package com.example.board.service;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.model.Article;

@Service
public class BoardService {
    private ApiService<List<Article>> apiService;

    public BoardService(ApiService<List<Article>> apiService) {
        this.apiService = apiService;
    }

    public List<Article> getBoards() {
        ResponseEntity<List<Article>> articles = apiService.get("http://localhost:8020/", HttpHeaders.EMPTY);
        return articles.getBody();
    }

}
