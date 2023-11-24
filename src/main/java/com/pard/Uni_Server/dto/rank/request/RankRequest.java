package com.pard.Uni_Server.dto.rank.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankRequest {
    private List<Integer> questions = new ArrayList<>();
}
