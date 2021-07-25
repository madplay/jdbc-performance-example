package com.madplay.example.service;

import org.springframework.stereotype.Service;

import com.madplay.example.model.Article;
import com.madplay.example.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {
	private final ArticleRepository articleRepository;

	public Article insert(Article article) {
		return articleRepository.save(article);
	}

	public void insertByNativeQuery(Article article) {
		articleRepository.saveArticle(article.getId(), article.getTitle(), article.getGroup());
	}
}
