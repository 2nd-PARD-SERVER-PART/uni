package com.pard.Uni_Server.entity.prof;

import com.pard.Uni_Server.entity.rank.Ranking;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int score;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profId")
    private Ranking ranking;

    @Builder
    public Prof(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
