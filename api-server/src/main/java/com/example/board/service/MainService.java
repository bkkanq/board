package com.example.board.service;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.board.model.Article;

@Service
public class MainService {
    private final Clock clock = Clock.fixed(Instant.EPOCH, ZoneId.systemDefault());
    public MainService(){}

    public List<Article> getArticles() {
        Date currentDate = Date.from(clock.instant());
        return List.of(new Article(1L, 1L, currentDate),
                       new Article(2L,1L, currentDate));
    }
}
