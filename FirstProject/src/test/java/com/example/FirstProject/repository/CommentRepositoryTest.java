package com.example.FirstProject.repository;

import com.example.FirstProject.entity.Article;
import com.example.FirstProject.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class CommentRepositoryTest {
@Autowired
CommentRepository commentRepository;
    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        /* Case 1 : 4번 게시글의 모든 댓글 조회 */
    }
    {
        Long articleId= 4L;
        List<Comment> comments = commentRepository.findByArticleId(articleId);
        Article article = new Article(4L, "당신의 인생 영화는?", "댓글 고");
        Comment a = new Comment(1L, article, "park","굿 윌 헌팅");
        Comment b = new Comment(2L,article,"kim","아이 엠 샘");
        Comment c = new Comment(3L,article,"choi","메이즈러너");
        List<Comment> expected = Arrays.asList(a,b,c);
        assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력(");
    }



    @Test
    void findByNickname() {
    }
}