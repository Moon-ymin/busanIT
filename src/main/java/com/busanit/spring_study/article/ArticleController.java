package com.busanit.spring_study.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public ResponseEntity<List<ArticleDTO>> getAllArticles() {
        List<ArticleDTO> articles = articleService.getAllArticles();
        return ResponseEntity.ok(articles);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDTO> getArticleById(@PathVariable Long id) {
        ArticleDTO article = articleService.getArticleById(id);
        if (article == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(article);
        }
    }

    @PostMapping
    public ResponseEntity<ArticleDTO> createArticle(@RequestBody ArticleDTO article) {
        ArticleDTO createdArticle = articleService.createArticle(article);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdArticle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateArticle(@PathVariable Long id, @RequestBody ArticleDTO updateArticle) {
        ArticleDTO article = articleService.updateArticle(id, updateArticle);
        if (article == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(article);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Long id) {
        boolean isDel = articleService.deleteArticle(id);
        if (!isDel) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().build();
        }
    }

    // 커스텀 쿼리 요청
    @GetMapping("/title/{title}")
    public List<ArticleDTO> getArticleByTitleContaining(@PathVariable String title) {
        return articleService.getArticleByTitleContaining(title);
    }

    @GetMapping("/author/{author}")
    public List<ArticleDTO> getArticleByAuthor(@PathVariable String author) {
        return articleService.getArticleByAuthor(author);
    }

    // 게시글 페이징, 정렬된 상태로 조회하기
    @GetMapping("/page")
    public ResponseEntity<Page<ArticleDTO>> getArticles(
            // 쿼리 매개변수로 데이터를 전달받고, 기본값을 설정
            @RequestParam(defaultValue = "0") int page,     // 페이지 번호 : 기본값 첫번째
            @RequestParam(defaultValue = "10") int size,    // 페이지 크기 : 10개
            @RequestParam(defaultValue = "id") String sortBy) // 정렬기준 컬럼 : 기본값 ID
    { 
        // 서비스 계층에서 DTO 를 받아서 클라이언트에 전달
        Page<ArticleDTO> articles = articleService.getArticles(page, size, sortBy);
        return ResponseEntity.ok(articles);
    }

    // 특정 저자의 게시글 페이징, 정렬된 상태로 조회
    @GetMapping("/author")
    public Page<ArticleDTO> getArticlesByAuthor(
            @RequestParam String author,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Page<ArticleDTO> articles = articleService.getArticlesByAuthor(author, page, size, sortBy);
        return articles;
    }
}
