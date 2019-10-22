package com.demo.common;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.demo.domain.Article;

public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
	public Article queryArticleById(Long id);
}