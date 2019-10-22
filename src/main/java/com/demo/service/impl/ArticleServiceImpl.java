package com.demo.service.impl;

import com.demo.common.ArticleSearchRepository;
import com.demo.domain.Article;
import com.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文章serviceImpl
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	private final ArticleSearchRepository articleSearchRepository;

	@Autowired
	public ArticleServiceImpl(ArticleSearchRepository articleSearchRepository) {
		this.articleSearchRepository = articleSearchRepository;
	}

	@Override
	public String add(Article article) {
		try {
			articleSearchRepository.save(article);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "defeated";
		}
	}

	@Override
	public String delete(Article article) {
		try {
			articleSearchRepository.delete(article);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "defeated";
		}
	}

	@Override
	public String update(Article article) {
		try {
			articleSearchRepository.save(article);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "defeated";
		}
	}

	@Override
	public Article queryArticleById(Long id) {
		return articleSearchRepository.queryArticleById(id);
	}
}
