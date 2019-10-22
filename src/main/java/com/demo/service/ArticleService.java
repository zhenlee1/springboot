package com.demo.service;

import com.demo.domain.Article;

/**
 * 文章service
 */
public interface ArticleService {

    //增加
    public String add(Article article);

    //删除
    public String delete(Article article);

    //局部更新
    public String update(Article article);

    //查询
    public Article queryArticleById(Long id);
}