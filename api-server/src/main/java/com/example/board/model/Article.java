package com.example.board.model;

import java.util.Date;

import org.springframework.web.bind.annotation.DeleteMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {
    private long article_id;
    private long author_id;
    private Date created_at;
}
