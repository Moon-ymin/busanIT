package com.example.articleapi;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 비즈니스 로직을 구현하고, CRUD 메서드를 통해 데이터베이스와 상호작용해야 합니다.
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() { return articleRepository.findAll(); }
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    @Transactional
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }
    @Transactional
    public Article updateArticle(Long id, Article updateArticle) {
        Article article = articleRepository.findById(id).orElse(null);
        if (article != null) {
            if (updateArticle.getTitle() != null) {
                article.setTitle(updateArticle.getTitle());
            }
            if (updateArticle.getContent() != null) {
                article.setTitle(updateArticle.getContent());
            }
            if (updateArticle.getAuthor() != null) {
                article.setTitle(updateArticle.getAuthor());
            }
            return  articleRepository.save(article);
        } else {
            return null;
        }
    }
    @Transactional
    public boolean deleteArticle(Long id) {
        Article article = articleRepository.findById(id).orElse(null);
        if (article != null) {
            articleRepository.delete(article);
            return true;
        } else {
            return false;
        }
    }
}
