package com.example.board.service;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.example.board.model.Article;
import com.example.board.repository.ArticleRepository;

@Service
public class ArticleService {
    private final static Logger LOG = Logger.getGlobal();

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository)
    {
        this.articleRepository = articleRepository;
    }

    public List<Article> getArticles() {
        try {
            return articleRepository.getArticles();
        } catch (RestClientException ex) {
            LOG.info("fail to get article from api-server" + ex.getMessage());
            throw ex;
        }
    }

}
