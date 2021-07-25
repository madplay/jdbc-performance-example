package com.madplay.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.madplay.example.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

	@Transactional
	@Modifying
	@Query(value = "INSERT INTO article (id, title, `group`) VALUES (:id, :title, :group)", nativeQuery = true)
	void saveArticle(Long id, String title, String group);
}
