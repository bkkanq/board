package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.board.service.ArticleService;

@Controller
public class MainController {

    private final ArticleService articleService;

    MainController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/hello")
    public String helloWorld(Model model) {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("helloWorld");
//        mv.addObject("message", "hello spring mvc");
        return "helloWorld";
    }

    @RequestMapping(value="/articles", method = RequestMethod.GET)
    public String getArticles(Model model) {
        model.addAttribute("articles", articleService.getArticles());
        return "main";
    }

}
