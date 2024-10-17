package com.norbigigakoks.electionresults.units;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Senate")
public class Senate {
    @Id
    private Long senateID;

    public Long getSenateID() {
        return senateID;
    }

    public void setSenateID(Long senateID) {
        this.senateID = senateID;
    }
}
