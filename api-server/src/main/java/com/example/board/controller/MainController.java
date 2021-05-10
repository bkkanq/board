package com.example.board.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.model.Article;
import com.example.board.service.ArticleService;

@RestController
@RequestMapping("/article")
public class MainController {
    private static Logger LOG = Logger.getGlobal();

    private ArticleService articleService;

    public MainController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public List<Article> getArticles() {
        List<Article> articles = articleService.getArticles();
        LOG.info("getArticles - plural : " + articles.get(0));
        return articleService.getArticles();
    }

    @GetMapping("/{id}")
    public Article getArticle(@PathVariable long id) {
        LOG.info("getArticle - single");
        return articleService.getArticle(id);
    }

    @PostMapping("/")
    public Article createArticle(Article article)
    {
        return articleService.createArticle(article);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable long id) {
        articleService.deleteArticle(id);
        return ResponseEntity.ok().build();

    }

}
