package com.norbigigakoks.electionresults.repository;

import com.norbigigakoks.electionresults.dto.CountyVoteSummary;
import com.norbigigakoks.electionresults.dto.VoivodeshipVoteSummary;
import com.norbigigakoks.electionresults.units.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
    @Query("SELECT new com.norbigigakoks.electionresults.dto.CountyVoteSummary(c.id, c.name, SUM(m.numberOfVotes), SUM(m.votesForKO), SUM(m.votesForPIS), SUM(m.votesForKONF), SUM(m.votesForTD), SUM(m.votesForLEW), SUM(m.votesForBS), SUM(m.votesForMN)) " +
            "FROM Municipality m " +
            "JOIN m.county c " +
            "GROUP BY c.id")
    List<CountyVoteSummary> findCountyVoteSummary();

    @Query("SELECT new com.norbigigakoks.electionresults.dto.VoivodeshipVoteSummary(v.id, v.name, SUM(m.numberOfVotes), SUM(m.votesForKO), SUM(m.votesForPIS), SUM(m.votesForKONF), SUM(m.votesForTD), SUM(m.votesForLEW), SUM(m.votesForBS), SUM(m.votesForMN)) " +
            "FROM Municipality m JOIN m.county c JOIN c.voivodeship v " +
            "GROUP BY v.id")
    List<VoivodeshipVoteSummary> findVoivodeshipVoteSummary();
}
