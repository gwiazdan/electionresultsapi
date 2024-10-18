package com.norbigigakoks.electionresults.units;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Senate")
public class Senate {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long ID) {
        this.id = ID;
    }
}
