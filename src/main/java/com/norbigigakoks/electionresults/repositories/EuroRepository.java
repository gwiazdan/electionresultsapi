package com.norbigigakoks.electionresults.repositories;

import com.norbigigakoks.electionresults.dto.EuroVoteSummary;
import com.norbigigakoks.electionresults.units.Euro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EuroRepository extends JpaRepository<Euro, Long> {
    @Query("SELECT new com.norbigigakoks.electionresults.dto.EuroVoteSummary(e.id, " +
            "e.name, " +
            "SUM(m.numberOfVotes), " +
            "(SUM(m.votesForKO) + " +
            "SUM(m.votesForMN)), " +
            "SUM(m.votesForPIS), " +
            "SUM(m.votesForKONF), " +
            "SUM(m.votesForTD), " +
            "SUM(m.votesForLEW), " +
            "SUM(m.votesForBS), " +
            "null) " +
            "FROM Municipality m JOIN m.county c JOIN c.euro e " +
            "GROUP BY e.id")
    List<EuroVoteSummary> findCountiesSummaries();

    @Query("SELECT new com.norbigigakoks.electionresults.dto.EuroVoteSummary(e.id, " +
            "e.name, " +
            "SUM(t.numberOfVotes), " +
            "SUM(t.votesForKO), " +
            "SUM(t.votesForPIS), " +
            "SUM(t.votesForKONF), " +
            "SUM(t.votesForTD), " +
            "SUM(t.votesForLEW), " +
            "SUM(t.votesForBS), " +
            "null) " +
            "FROM Territory t JOIN t.euro e " +
            "GROUP BY e.id")
    List<EuroVoteSummary> findTerritorySummaries();
}
