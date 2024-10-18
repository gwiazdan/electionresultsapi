package com.norbigigakoks.electionresults.units;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Entity
@Table(name="Municipalities")
public class Municipality {

    @Id
    private Long id;
    private String name;
    @Column(name="Number_Of_Votes")
    private int numberOfVotes;
    @Column(name="Votes_ForKO")
    private int votesForKO;
    @Column(name="Votes_ForLEW")
    private int votesForLEW;
    @Column(name="Votes_ForTD")
    private int votesForTD;
    @Column(name="Votes_ForKONF")
    private int votesForKONF;
    @Column(name="Votes_ForPIS")
    private int votesForPIS;
    @Column(name="Votes_ForBS")
    private int votesForBS;

    @JsonInclude(NON_NULL)
    @Column(name="Votes_ForMN")
    private Integer votesForMN;


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

    public Integer getVotesForMN() {
        return votesForMN;
    }

    public void setVotesForMN(Integer votesForMN) {
        this.votesForMN = votesForMN;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long ID) {
        this.id = ID;
    }
}
