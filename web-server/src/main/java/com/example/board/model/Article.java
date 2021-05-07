package com.example.board.model;

import java.util.Date;

import lombok.Data;

@Data
public class Article {
    private long article_id;
    private long author_id;
    private Date created_at;
}
