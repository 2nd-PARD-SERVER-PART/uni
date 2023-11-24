package com.pard.Uni_Server.service.comment;

import com.pard.Uni_Server.dto.comment.request.CommentRequest;
import com.pard.Uni_Server.entity.comment.Comment;
import com.pard.Uni_Server.repository.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment leaveComment(CommentRequest request) {
        return commentRepository.save(request.toEntity());
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public List<Comment> findByProf(String name) {
        return commentRepository.findBySelectedProf(name);
    }
}
