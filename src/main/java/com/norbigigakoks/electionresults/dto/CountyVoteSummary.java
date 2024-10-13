package com.norbigigakoks.electionresults.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class CountyVoteSummary {
    private Long countyID;
    private String name;
    private Long votes;
    private Long votesForKO;
    private Long votesForPIS;
    private Long votesForKONF;
    private Long votesForTD;
    private Long votesForLEW;
    private Long votesForBS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long votesForMN;


    public CountyVoteSummary(Long countyID, String name, Long votes, Long votesForKO, Long votesForPIS, Long votesForKONF, Long votesForTD, Long votesForLEW, Long votesForBS, Long votesForMN) {
        this.countyID = countyID;
        this.name = name;
        this.votes = votes;
        this.votesForKO = votesForKO;
        this.votesForPIS = votesForPIS;
        this.votesForKONF = votesForKONF;
        this.votesForTD = votesForTD;
        this.votesForLEW = votesForLEW;
        this.votesForBS = votesForBS;
        this.votesForMN = votesForMN;
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

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
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
}


