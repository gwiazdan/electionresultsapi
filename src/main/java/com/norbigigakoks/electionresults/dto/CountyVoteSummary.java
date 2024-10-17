package com.norbigigakoks.electionresults.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.norbigigakoks.electionresults.units.Senate;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class CountyVoteSummary {
    private Long countyID;
    private String name;
    private Long numberOfVotes;
    private Long votesForKO;
    private Long votesForPIS;
    private Long votesForKONF;
    private Long votesForTD;
    private Long votesForLEW;
    private Long votesForBS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long votesForMN;


    public CountyVoteSummary(Long countyID, String name, Long numberOfVotes, Long votesForKO, Long votesForPIS, Long votesForKONF, Long votesForTD, Long votesForLEW, Long votesForBS, Long votesForMN, Senate senate) {
        this.countyID = countyID;
        this.name = name;
        this.numberOfVotes = numberOfVotes;
        this.votesForKO = votesForKO;
        this.votesForPIS = votesForPIS;
        this.votesForKONF = votesForKONF;
        this.votesForTD = votesForTD;
        this.votesForLEW = votesForLEW;
        this.votesForBS = votesForBS;
        this.votesForMN = votesForMN;
        this.senate = senate;
    }

    public String getName() {
        return name;
    }

    public void setVotesForBS(Long votesForBS) {
        this.votesForBS = votesForBS;
    }

    public Long getVotesForBS() {
        return votesForBS;
    }

    public Long getCountyID() {
        return countyID;
    }

    public void setCountyID(Long countyID) {
        this.countyID = countyID;
    }

    public Long getVotesForKO() {
        return votesForKO;
    }

    public void setVotesForKO(Long votesForKO) {
        this.votesForKO = votesForKO;
    }

    public Long getVotesForPIS() {
        return votesForPIS;
    }

    public void setVotesForPIS(Long votesForPIS) {
        this.votesForPIS = votesForPIS;
    }

    public Long getVotesForKONF() {
        return votesForKONF;
    }

    public void setVotesForKONF(Long votesForKONF) {
        this.votesForKONF = votesForKONF;
    }

    public Long getVotesForTD() {
        return votesForTD;
    }

    public void setVotesForTD(Long votesForTD) {
        this.votesForTD = votesForTD;
    }

    public Long getVotesForLEW() {
        return votesForLEW;
    }

    public void setVotesForLEW(Long votesForLEW) {
        this.votesForLEW = votesForLEW;
    }

    public Long getVotesForMN() {
        return votesForMN;
    }

    public void setVotesForMN(Long votesForMN) {
        this.votesForMN = votesForMN;
    }

    public Long getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Long numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    @ManyToOne
    @JoinColumn(name = "SenateID")
    @JsonIgnore
    private Senate senate;

    public Senate getSenate() {
        return senate;
    }

    public void setSenate(Senate senate) {
        this.senate = senate;
    }
}


