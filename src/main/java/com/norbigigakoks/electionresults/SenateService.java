package com.norbigigakoks.electionresults;

import com.norbigigakoks.electionresults.dto.SenateVoteSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SenateService {

    @Autowired
    private SenateRepository senateRepository;

    public List<SenateVoteSummary> getSenateResults() {
        List<SenateVoteSummary> countiesSummaries = senateRepository.findCountiesSummaries();
        List<SenateVoteSummary> territorySummaries = senateRepository.findTerritorySummaries();

        Map<Long, SenateVoteSummary> summaryMap = new HashMap<>();

        for (SenateVoteSummary summary : countiesSummaries) {
            summaryMap.put(summary.getSenateID(), summary);
        }

        for (SenateVoteSummary summary : territorySummaries) {
            summaryMap.merge(summary.getSenateID(), summary, (oldSummary, newSummary) -> {
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