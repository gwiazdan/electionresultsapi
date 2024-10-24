package com.norbigigakoks.electionresults.repositories;

import com.norbigigakoks.electionresults.dto.SejmVoteSummary;
import com.norbigigakoks.electionresults.units.Sejm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SejmRepository extends JpaRepository<Sejm, Long> {
    @Query("SELECT new com.norbigigakoks.electionresults.dto.SejmVoteSummary(s.id, " +
            "s.name, " +
            "s.seats, " +
            "SUM(m.numberOfVotes), " +
            "SUM(m.votesForKO), " +
            "SUM(m.votesForPIS), " +
            "SUM(m.votesForKONF), " +
            "SUM(m.votesForTD), " +
            "SUM(m.votesForLEW), " +
            "SUM(m.votesForBS), " +
            "SUM(m.votesForMN )) " +
            "FROM Municipality m JOIN m.county c JOIN c.sejm s " +
            "GROUP BY s.id")
    List<SejmVoteSummary> findCountiesSummaries();

    @Query("SELECT new com.norbigigakoks.electionresults.dto.SejmVoteSummary(s.id, " +
            "s.name, " +
            "s.seats, " +
            "SUM(t.numberOfVotes), " +
            "SUM(t.votesForKO), " +
            "SUM(t.votesForPIS), " +
            "SUM(t.votesForKONF), " +
            "SUM(t.votesForTD), " +
            "SUM(t.votesForLEW), " +
            "SUM(t.votesForBS), " +
            "null) " +
            "FROM Territory t JOIN t.sejm s " +
            "GROUP BY s.id")
    List<SejmVoteSummary> findTerritorySummaries();
}
