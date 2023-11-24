package com.pard.Uni_Server.controller.comment;

import com.pard.Uni_Server.dto.comment.request.CommentRequest;
import com.pard.Uni_Server.dto.comment.response.CommentResponse;
import com.pard.Uni_Server.entity.comment.Comment;
import com.pard.Uni_Server.service.comment.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    @PostMapping("")
    public ResponseEntity<Comment> leaveComment(@RequestBody CommentRequest request) {
        Comment comment = commentService.leaveComment(request);

        return ResponseEntity.ok()
                .body(comment);
    }

    @GetMapping("")
    public ResponseEntity<List<CommentResponse>> findAll() {
        List<CommentResponse> comments = commentService.findAll()
                .stream()
                .map(CommentResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(comments);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<CommentResponse>> findByProf(@PathVariable String name) {
        List<CommentResponse> comments = commentService.findByProf(name)
                .stream()
                .map(CommentResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(comments);
    }
}
