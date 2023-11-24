package com.pard.Uni_Server.dto.comment.request;

import com.pard.Uni_Server.entity.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequest {
    private String writer;
    private String selectedProf;
    private String content;

    public Comment toEntity() {
        return Comment.builder()
                .writer(writer)
                .selectedProf(selectedProf)
                .content(content)
                .build();
    }
}
