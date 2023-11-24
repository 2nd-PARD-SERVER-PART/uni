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
        String profName = "";
        switch (name) {
            case "hwang":
                profName = "황성수";
                break;
            case "seok":
                profName = "김기석";
                break;
            case "yong":
                profName = "용환기";
                break;
            case "jang":
                profName = "장소연";
                break;
            case "jung":
                profName = "김인중";
                break;
            case "gwang":
                profName = "김광";
                break;
            case "hong":
                profName = "홍참길";
                break;
            case "seob":
                profName = "김영섭";
                break;
            case "ho":
                profName = "김호준";
                break;
            case "go":
                profName = "고윤민";
                break;
            case "jc":
                profName = "남재창";
                break;
            case "sin":
                profName = "홍신";
                break;
        }

        return commentRepository.findBySelectedProf(profName);
    }
}
