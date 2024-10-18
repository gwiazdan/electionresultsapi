package com.norbigigakoks.electionresults.repository;

import com.norbigigakoks.electionresults.dto.SenateVoteSummary;
import com.norbigigakoks.electionresults.units.Senate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SenateRepository extends JpaRepository<Senate, Long> {
    @Query("SELECT new com.norbigigakoks.electionresults.dto.SenateVoteSummary(s.id, " +
            "SUM(m.numberOfVotes), " +
            "SUM(m.votesForKO), " +
            "SUM(m.votesForPIS), " +
            "SUM(m.votesForKONF), " +
            "SUM(m.votesForTD), " +
            "SUM(m.votesForLEW), " +
            "SUM(m.votesForBS), " +
            "SUM(m.votesForMN )) " +
            "FROM Municipality m JOIN m.county c JOIN c.senate s " +
            "GROUP BY s.id")
    List<SenateVoteSummary> findCountiesSummaries();

    @Query("SELECT new com.norbigigakoks.electionresults.dto.SenateVoteSummary(s.id, " +
            "SUM(t.numberOfVotes), " +
            "SUM(t.votesForKO), " +
            "SUM(t.votesForPIS), " +
            "SUM(t.votesForKONF), " +
            "SUM(t.votesForTD), " +
            "SUM(t.votesForLEW), " +
            "SUM(t.votesForBS), " +
            "null) " +
            "FROM Territory t JOIN t.senate s " +
            "GROUP BY s.id")
    List<SenateVoteSummary> findTerritorySummaries();
}
