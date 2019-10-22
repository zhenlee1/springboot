package com.demo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Document(indexName = "collect", type = "article")
public class Article implements Serializable {
	@Id
	private Long id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 发布时间
	 */
	private Date postTime;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 作者
	 */
	private String describe;

	public Article() {
	}

	public Article(Long id, String title, String content, Date postTime, String author, String describe) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.postTime = postTime;
		this.author = author;
		this.describe = describe;
	}

	@Override
	public String toString() {
		return "Article{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + ", postTime="
			+ postTime + ", author='" + author + '\'' + ", describe='" + describe + '\'' + '}';
	}
}