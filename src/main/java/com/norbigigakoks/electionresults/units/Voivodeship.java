package com.norbigigakoks.electionresults.units;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Voivodeships")
public class Voivodeship {
    @Id
    private Long voivodeshipID;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVoivodeshipID() {
        return voivodeshipID;
    }

    public void setVoivodeshipID(Long voivodeshipID) {
        this.voivodeshipID = voivodeshipID;
    }
}
