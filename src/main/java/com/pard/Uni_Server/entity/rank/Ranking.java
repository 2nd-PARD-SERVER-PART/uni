package com.pard.Uni_Server.entity.rank;

import com.pard.Uni_Server.entity.prof.Prof;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int count;

    @OneToMany(mappedBy = "ranking", cascade = CascadeType.ALL)
    private List<Prof> profs = new ArrayList<>();
}

