package com.example.board.model;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
    private long article_id;
    private long author_id;
    private Date created_at;
}
