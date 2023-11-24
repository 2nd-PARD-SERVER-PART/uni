package com.pard.Uni_Server.dto.prof.response;

import com.pard.Uni_Server.entity.prof.Prof;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfResponse {
    private Long id;
    private String name;
    private int score;

    public ProfResponse(Prof prof) {
        this.id = prof.getId();
        this.name = prof.getName();
        this.score = prof.getScore();
    }
}
