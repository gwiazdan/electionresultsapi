package com.norbigigakoks.electionresults.services;

import com.norbigigakoks.electionresults.dto.SejmikVoteSummary;
import com.norbigigakoks.electionresults.repositories.SejmikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SejmikService {

    @Autowired
    private SejmikRepository sejmikRepository;

    public List<SejmikVoteSummary> getSejmikResults() {
        List<SejmikVoteSummary> countiesSummaries = sejmikRepository.findCountiesSummaries();
        List<SejmikVoteSummary> territorySummaries = sejmikRepository.findTerritorySummaries();

        Map<Long, SejmikVoteSummary> summaryMap = new HashMap<>();

        for (SejmikVoteSummary summary : countiesSummaries) {
            summaryMap.put(summary.getId(), summary);
        }

        for (SejmikVoteSummary summary : territorySummaries) {
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
