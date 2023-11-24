package com.pard.Uni_Server.dto.prof.response;

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
}
