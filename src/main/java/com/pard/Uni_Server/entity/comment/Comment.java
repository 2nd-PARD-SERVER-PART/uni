package com.pard.Uni_Server.entity.comment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String writer;
    private String selectedProf;
    private String content;
    @CreationTimestamp
    private Timestamp createdTime;

    @Builder
    public Comment(String writer, String selectedProf, String content) {
        this.writer = writer;
        this.selectedProf = selectedProf;
        this.content = content;
    }
}
