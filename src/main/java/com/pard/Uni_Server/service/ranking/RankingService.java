package com.pard.Uni_Server.service.ranking;

import com.pard.Uni_Server.entity.prof.Prof;
import com.pard.Uni_Server.repository.prof.ProfRepository;
import com.pard.Uni_Server.repository.ranking.RankingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankingService {
    private final RankingRepository rankingRepository;
    private final ProfRepository profRepository;

    private void getResult() {
        String name = "용환기";
        Prof prof = profRepository.findByName(name);

        prof.setScore(prof.getScore() + 1);
    }

    private void rank() {
        List<Prof> profs = profRepository.findTop3ByOrderByScoreDesc();
    }

}
