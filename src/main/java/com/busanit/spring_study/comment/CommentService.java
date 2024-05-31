package com.busanit.spring_study.comment;

import com.busanit.spring_study.article.Article;
import com.busanit.spring_study.article.ArticleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;

    // Entity -> DTO로 변환하여 전달
    public List<CommentDTO> getAllComments() {
        List<Comment> comments = commentRepository.findAll();
        return  comments.stream().map(Comment::toDTO).toList();
    }
    public CommentDTO getCommentById(Long id) {
        return commentRepository.findById(id).orElse(null).toDTO();
    }

    @Transactional
    public CommentDTO createComment(CommentDTO dto) {
        // Article ID 가 존재하지 안는 경우
        Article article = articleRepository.findById(dto.getArticleId()).orElse(null);

        if (article == null) {
            throw new RuntimeException("존재하지 않는 Article");
        }
        // 1번 방법 : 생성 메서드 사용 DTO -> 엔티티 변환
        // Comment comment = Comment.createComment(dto);
        // 2번 방법 : toEntity 사용 변환
        Comment comment = dto.toEntity(article);
        Comment saved = commentRepository.save(comment);
        return saved.toDTO();
    }
    @Transactional
    public CommentDTO updateComment(Long id, Comment updateComment) {
        Comment comment = commentRepository.findById(id).orElse(null);

        if (comment != null) {
            if (updateComment.getContent() != null) {
                comment.setContent(updateComment.getContent());
            }
            if (updateComment.getAuthor() != null) {
                comment.setContent(updateComment.getAuthor());
            }
            // 댓글의 게시글까지 변경하고 싶은 경우 (로직 추가)
            return  commentRepository.save(comment).toDTO();
        } else {
            return null;
        }
    }
    @Transactional
    public boolean deleteComment(Long id) {
        Comment comment = commentRepository.findById(id).orElse(null);
        if (comment != null) {
            commentRepository.delete(comment);
            return true;
        } else {
            return false;
        }
    }
}
