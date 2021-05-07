package com.example.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.model.Article;
import com.example.board.service.BoardService;

@Controller
public class MainController {

    private final BoardService boardService;

    MainController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("/hello")
    public String helloWorld(Model model) {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("helloWorld");
//        mv.addObject("message", "hello spring mvc");
        return "helloWorld";
    }

    @RequestMapping(value="/articles", method = RequestMethod.GET)
    public Model getArticles(Model model) {
        model.addAttribute("articles", boardService.getBoards());
        return model;
    }

}
