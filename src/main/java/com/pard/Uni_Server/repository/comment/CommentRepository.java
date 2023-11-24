package com.pard.Uni_Server.repository.comment;

import com.pard.Uni_Server.entity.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findBySelectedProf(String name);
}
