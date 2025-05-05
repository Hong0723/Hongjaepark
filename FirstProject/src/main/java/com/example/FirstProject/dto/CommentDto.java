package com.example.FirstProject.dto;

import com.example.FirstProject.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor


public class CommentDto {
    private Long id;
    private Long articleId;
    private String nickname;
    private String body;

    public CommentDto(Long id, Long articleId, String nickname, String body) {
        this.id = id;
        this.articleId = articleId;
        this.nickname = nickname;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", nickname='" + nickname + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public static CommentDto createCommentDto(Comment comment) {
    return new CommentDto(
            comment.getId(),
            comment.getArticle().getId(),
            comment.getNickname(),
            comment.getBody()
    );
    }

}
