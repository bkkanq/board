package com.example.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.model.Article;
import com.example.board.service.MainService;

@RestController
public class MainController {

    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public List<Article> main() {
        return mainService.getArticles();
    }
}
