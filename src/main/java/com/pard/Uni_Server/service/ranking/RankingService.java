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

    /*
    jc: 0, //남재창
    sin: 0, //홍신
    */
    public void result(String name) {
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

        Prof prof = profRepository.findByName(profName);

        prof.setScore(prof.getScore() + 1);
    }

    public List<Prof> rank() {
        List<Prof> profs = profRepository.findTop3ByOrderByScoreDesc();

        return profs;
    }

//    private int entireCount() {
//        Ranking ranking;
//        return
//    }

}
