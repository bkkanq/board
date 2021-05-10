package com.example.board.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.board.model.Article;

@Service
public class ApiService<T, R> {

    private RestTemplate restTemplate;

    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<R> getArticles(String url, HttpHeaders httpHeaders) {
        //https://stackoverflow.com/questions/2012306/how-to-create-a-class-literal-of-a-known-type-classliststring
        //
        //ResponseEntity<List<T>> ret = ResponseEntity.ok().build();
        //List<T> newtest = new ArrayList<>();
        //ResponseEntity<Article[]> response = restTemplate.getForEntity(url,  Article[].class);
        ResponseEntity<R> listResponseEntity = callApiEndPointPlural(url, HttpMethod.GET, httpHeaders, null, (Class<R>) Object.class);
        return listResponseEntity;
    }

    //private ResponseEntity<List<T>> callApiEndPointPlural(String url, HttpMethod httpMethod, HttpHeaders httpHeaders, Object body, Class<? extends List> clazz) {
    private ResponseEntity<R> callApiEndPointPlural(String url, HttpMethod httpMethod, HttpHeaders httpHeaders, Object body, Class<R> clazz) {
        return restTemplate.exchange(url, httpMethod, new HttpEntity<>(body, httpHeaders), clazz);
    }

    private ResponseEntity<T> callApiEndPoint(String url, HttpMethod httpMethod, HttpHeaders httpHeaders, Object body, Class<T> clazz) {
        return restTemplate.exchange(url, httpMethod, new HttpEntity<>(body, httpHeaders), clazz);
    }
}
