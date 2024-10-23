package com.norbigigakoks.electionresults.units;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Entity
@Table(name = "Territories")
public class Territory {

    @Id
    private Long id;
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

    @JsonInclude(NON_NULL)
    @ManyToOne(optional = true)
    @JoinColumn(name = "senateID")
    @JsonIgnore
    private Senate senate;

    @JsonInclude(NON_NULL)
    @ManyToOne(optional = true)
    @JoinColumn(name = "sejmID")
    @JsonIgnore
    private Sejm sejm;

    @JsonInclude(NON_NULL)
    @ManyToOne
    @JoinColumn(name = "sejmikID")
    @JsonIgnore
    private Sejmik sejmik;

    @JsonInclude(NON_NULL)
    @ManyToOne
    @JoinColumn(name = "europarlamentID")
    @JsonIgnore
    private Euro euro;

    public Senate getSenate() {
        return senate;
    }

    public void setSenate(Senate senate) {
        this.senate = senate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long ID) {
        this.id = ID;
    }

    public Sejm getSejm() {
        return sejm;
    }

    public void setSejm(Sejm sejm) {
        this.sejm = sejm;
    }

    public Sejmik getSejmik() {
        return sejmik;
    }

    public void setSejmik(Sejmik sejmik) {
        this.sejmik = sejmik;
    }

    public Euro getEuro() {
        return euro;
    }

    public void setEuro(Euro euro) {
        this.euro = euro;
    }
}