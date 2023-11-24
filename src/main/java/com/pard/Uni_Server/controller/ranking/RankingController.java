package com.pard.Uni_Server.controller.ranking;

import com.pard.Uni_Server.dto.prof.response.ProfResponse;
import com.pard.Uni_Server.entity.prof.Prof;
import com.pard.Uni_Server.entity.rank.Ranking;
import com.pard.Uni_Server.repository.ranking.RankingRepository;
import com.pard.Uni_Server.service.ranking.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rankings")
public class RankingController {
    private final RankingService rankingService;
    private final RankingRepository rankingRepository;

    @GetMapping("/{profName}")
    public void getResult(@PathVariable String profName) {
        Ranking ranking = rankingRepository.findById(1L).orElse(null);
        ranking.setCount(ranking.getCount() + 1);
        rankingService.result(profName);
        rankingRepository.save(ranking);
    }

    @GetMapping("")
    public ResponseEntity<List<ProfResponse>> rank() {
        List<ProfResponse> responses = rankingService.rank()
                .stream()
                .map(ProfResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(responses);
    }

    @GetMapping("/count")
    public int entireCount() {
        Ranking ranking = rankingRepository.findById(1L).orElse(null);

        return ranking.getCount();
    }
}
