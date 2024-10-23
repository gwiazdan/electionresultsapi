package com.norbigigakoks.electionresults.repositories;

import com.norbigigakoks.electionresults.dto.SejmikVoteSummary;
import com.norbigigakoks.electionresults.units.Sejmik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SejmikRepository extends JpaRepository<Sejmik, Long> {
    @Query("SELECT new com.norbigigakoks.electionresults.dto.SejmikVoteSummary(s.id, " +
            "s.name, " +
            "s.number, " +
            "s.voivodeship.id, " +
            "s.seats, " +
            "SUM(m.numberOfVotes), " +
            "SUM(m.votesForKO), " +
            "SUM(m.votesForPIS), " +
            "SUM(m.votesForKONF), " +
            "SUM(m.votesForTD), " +
            "SUM(m.votesForLEW), " +
            "SUM(m.votesForBS), " +
            "SUM(m.votesForMN )) " +
            "FROM Municipality m JOIN m.county c JOIN c.sejmik s " +
            "GROUP BY s.id")
    List<SejmikVoteSummary> findCountiesSummaries();

    @Query("SELECT new com.norbigigakoks.electionresults.dto.SejmikVoteSummary(s.id, " +
            "s.name, " +
            "s.number, " +
            "s.voivodeship.id, " +
            "s.seats, " +
            "SUM(t.numberOfVotes), " +
            "SUM(t.votesForKO), " +
            "SUM(t.votesForPIS), " +
            "SUM(t.votesForKONF), " +
            "SUM(t.votesForTD), " +
            "SUM(t.votesForLEW), " +
            "SUM(t.votesForBS), " +
            "null) " +
            "FROM Territory t JOIN t.sejmik s " +
            "GROUP BY s.id")
    List<SejmikVoteSummary> findTerritorySummaries();
}
