package com.pard.Uni_Server.dto.rank.response;

import com.pard.Uni_Server.entity.prof.Prof;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankResponse {
    private int count;
    private List<Prof> profs;
}
