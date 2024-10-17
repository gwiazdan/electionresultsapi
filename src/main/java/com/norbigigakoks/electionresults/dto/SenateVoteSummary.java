package com.norbigigakoks.electionresults.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class SenateVoteSummary {
    private Long senateID;
    private Long numberOfVotes;
    private Long votesForKO;
    private Long votesForPIS;
    private Long votesForKONF;
    private Long votesForTD;
    private Long votesForLEW;
    private Long votesForBS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long votesForMN;

    public SenateVoteSummary(Long senateID, Long numberOfVotes, Long votesForKO, Long votesForPIS, Long votesForKONF, Long votesForTD, Long votesForLEW, Long votesForBS, Long votesForMN) {
        this.senateID = senateID;
        this.numberOfVotes = numberOfVotes;
        this.votesForKO = votesForKO;
        this.votesForPIS = votesForPIS;
        this.votesForKONF = votesForKONF;
        this.votesForTD = votesForTD;
        this.votesForLEW = votesForLEW;
        this.votesForBS = votesForBS;
        this.votesForMN = votesForMN;
    }

    public Long getSenateID() {
        return senateID;
    }

    public void setSenateID(Long senateID) {
        this.senateID = senateID;
    }

    public Long getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Long numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
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

    public Long getVotesForBS() {
        return votesForBS;
    }

    public void setVotesForBS(Long votesForBS) {
        this.votesForBS = votesForBS;
    }

    public Long getVotesForMN() {
        return votesForMN;
    }

    public void setVotesForMN(Long votesForMN) {
        this.votesForMN = votesForMN;
    }
}
