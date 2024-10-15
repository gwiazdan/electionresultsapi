package com.norbigigakoks.electionresults.units;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdditionalTerritories")
public class Territory {

    @Id
    private Long territoryID;
    private String name;
    @Column(name = "Number_Of_Votes")
    private int numberOfVotes;
    @Column(name = "Votes_ForKO")
    private int votesForKO;
    @Column(name = "Votes_ForPIS")
    private int votesForPIS;
    @Column(name = "Votes_ForKONF")
    private int votesForKONF;
    @Column(name = "Votes_ForTD")
    private int votesForTD;
    @Column(name = "Votes_ForLEW")
    private int votesForLEW;
    @Column(name = "Votes_ForBS")
    private int votesForBS;


    public Long getMunicipalityID() {
        return territoryID;
    }

    public void setMunicipalityID(Long municipalityID) {
        this.territoryID = municipalityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public int getVotesForKO() {
        return votesForKO;
    }

    public void setVotesForKO(int votesForKO) {
        this.votesForKO = votesForKO;
    }

    public int getVotesForPIS() {
        return votesForPIS;
    }

    public void setVotesForPIS(int votesForPIS) {
        this.votesForPIS = votesForPIS;
    }

    public int getVotesForKONF() {
        return votesForKONF;
    }

    public void setVotesForKONF(int votesForKONF) {
        this.votesForKONF = votesForKONF;
    }

    public int getVotesForTD() {
        return votesForTD;
    }

    public void setVotesForTD(int votesForTD) {
        this.votesForTD = votesForTD;
    }

    public int getVotesForLEW() {
        return votesForLEW;
    }

    public void setVotesForLEW(int votesForLEW) {
        this.votesForLEW = votesForLEW;
    }

    public int getVotesForBS() {
        return votesForBS;
    }

    public void setVotesForBS(int votesForBS) {
        this.votesForBS = votesForBS;
    }
}