package com.madplay.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.madplay.example.model.Article;
import com.madplay.example.service.ArticleService;

@SpringBootTest
class SpringDataJpaExampleApplicationTests {

	@Autowired
	private ArticleService articleService;

	private Article makeDummyArticle() {
		return Article.builder()
			.id(1L)
			.title("test")
			.description("testtest")
			.order("1")
			.group("2")
			.build();
	}

	@Test
	void contextLoads() {
		Article article = makeDummyArticle();
		articleService.insertByNativeQuery(article);
	}

}
