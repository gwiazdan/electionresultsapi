package com.norbigigakoks.electionresults.services;

import com.norbigigakoks.electionresults.dto.EuroVoteSummary;
import com.norbigigakoks.electionresults.repositories.EuroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EuroService {

    @Autowired
    private EuroRepository euroRepository;

    public List<EuroVoteSummary> getEuroResults() {
        List<EuroVoteSummary> countiesSummaries = euroRepository.findCountiesSummaries();
        List<EuroVoteSummary> territorySummaries = euroRepository.findTerritorySummaries();

        Map<Long, EuroVoteSummary> summaryMap = new HashMap<>();

        for (EuroVoteSummary summary : countiesSummaries) {
            summaryMap.put(summary.getId(), summary);
        }

        for (EuroVoteSummary summary : territorySummaries) {
            summaryMap.merge(summary.getId(), summary, (oldSummary, newSummary) -> {
                oldSummary.setNumberOfVotes(oldSummary.getNumberOfVotes() + newSummary.getNumberOfVotes());
                oldSummary.setVotesForKO(oldSummary.getVotesForKO() + newSummary.getVotesForKO());
                oldSummary.setVotesForPIS(oldSummary.getVotesForPIS() + newSummary.getVotesForPIS());
                oldSummary.setVotesForKONF(oldSummary.getVotesForKONF() + newSummary.getVotesForKONF());
                oldSummary.setVotesForTD(oldSummary.getVotesForTD() + newSummary.getVotesForTD());
                oldSummary.setVotesForLEW(oldSummary.getVotesForLEW() + newSummary.getVotesForLEW());
                oldSummary.setVotesForBS(oldSummary.getVotesForBS() + newSummary.getVotesForBS());
                oldSummary.setVotesForMN(oldSummary.getVotesForMN());
                return oldSummary;
            });
        }
        return new ArrayList<>(summaryMap.values());
    }
}
