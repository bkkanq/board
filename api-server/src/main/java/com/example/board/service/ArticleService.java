package com.example.board.service;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.board.model.Article;

@Service
public class ArticleService {
    private final Clock clock = Clock.fixed(Instant.EPOCH, ZoneId.systemDefault());

    public ArticleService(){}

    public List<Article> getArticles() {
        Date currentDate = Date.from(clock.instant());
        return List.of(new Article(1L, 1L, currentDate),
                       new Article(2L,1L, currentDate));
    }

    public Article getArticle(long id) {
        Date currentDate = Date.from(clock.instant());
        return new Article(1L, 1L, currentDate);
    }

    public void deleteArticle(long id) {}

    public Article createArticle(Article article) {
        return article;

    }
}
