package com.example.board.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import com.google.common.annotations.VisibleForTesting;

public class ThymeleafViewResolverConfig {
//    @Value("${thymeleaf.cache}")
//    private boolean isCache;

    // https://eblo.tistory.com/54
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("classpath:templates/");
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("LEGACYHTML5");
        //templateResolver.setCacheable(isCache);
        return templateResolver;
    }
}
