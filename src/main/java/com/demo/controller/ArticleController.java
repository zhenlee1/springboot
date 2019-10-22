package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Article;
import com.demo.service.ArticleService;

/**
 * 文章Controller
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/add")
    public String add(Article article) throws Exception {
        try{
            articleService.add(article);
            return "success";
        }catch(Exception e){
            return "fail";
        }
    }

    @RequestMapping("/delete")
    public String delete(Article article) throws Exception {
        try{
            articleService.delete(article);
            return "success";
        }catch(Exception e){
            return "fail";
        }
    }

    @RequestMapping("/update")
    public String update(Article article) throws Exception {
        try{
            articleService.update(article);
            return "success";
        }catch(Exception e){
            return "fail";
        }
    }

    @RequestMapping("/queryArticleById")
    public Article queryArticleById(Long id) throws Exception {
        try{
            return articleService.queryArticleById(id);
        }catch(Exception e){
            return null;
        }
    }
}