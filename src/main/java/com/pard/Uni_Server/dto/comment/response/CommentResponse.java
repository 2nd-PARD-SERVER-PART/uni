package com.pard.Uni_Server.dto.comment.response;

import com.pard.Uni_Server.entity.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponse {
    private Long id;
    private String writer;
    private String prof;
    private String content;
    private Timestamp createdTime;

    public CommentResponse(Comment comment) {
        this.id = comment.getId();
        this.writer = comment.getWriter();
        this.prof = comment.getSelectedProf();
        this.content = comment.getContent();
        this.createdTime = comment.getCreatedTime();
    }
}
