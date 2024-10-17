package com.norbigigakoks.electionresults.units;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="Counties")
public class County {
    @Id
    private Long countyID;

    private String name;

    // Getters and Setters
    public Long getCountyID() {
        return countyID;
    }

    public void setCountyID(Long countyID) {
        this.countyID = countyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name="voivodeshipID")
    @JsonIgnore
    private Voivodeship voivodeship;

    public Voivodeship getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(Voivodeship voivodeship) {
        this.voivodeship = voivodeship;
    }

    @ManyToOne
    @JoinColumn(name = "senateID")
    @JsonIgnore
    private Senate senate;

    public Senate getSenate() {
        return senate;
    }

    public void setSenate(Senate senate) {
        this.senate = senate;
    }
}
