package com.example.articleapi;

import org.springframework.data.jpa.repository.JpaRepository;

// 인터페이스는 JpaRepository를 상속받아 기본 CRUD 기능을 제공해야 합니다.
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
