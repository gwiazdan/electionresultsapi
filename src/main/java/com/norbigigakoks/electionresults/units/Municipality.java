package com.norbigigakoks.electionresults.units;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="Municipalities")
public class Municipality {

    @Id
    private Long municipalityID;
    private String name;
    private int numberOfVotes;
    private int votesForKO;
    private int votesForPIS;
    private int votesForKONF;
    private int votesForTD;
    private int votesForLEW;
    private int votesForBS;

    public Long getMunicipalityID() {
        return municipalityID;
    }

    public void setMunicipalityID(Long municipalityID) {
        this.municipalityID = municipalityID;
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

    @ManyToOne
    @JoinColumn(name="countyid")
    @JsonIgnore
    private County county;

    public void setCounty(County county) {
        this.county = county;
    }

    public County getCounty() {
        return county;
    }
}
