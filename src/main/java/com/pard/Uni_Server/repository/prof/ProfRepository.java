package com.pard.Uni_Server.repository.prof;

import com.pard.Uni_Server.entity.prof.Prof;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfRepository extends JpaRepository<Prof, Long> {
    Prof findByName(String name);

    List<Prof> findTop3ByOrderByScoreDesc();
}