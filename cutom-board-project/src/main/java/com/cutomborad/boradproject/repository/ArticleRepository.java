package com.cutomborad.boradproject.repository;

import com.cutomborad.boradproject.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}