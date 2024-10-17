package com.norbigigakoks.electionresults.repository;

import com.norbigigakoks.electionresults.units.Territory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TerritoriesRepository extends JpaRepository<Territory, Long> {
    public List<Territory> findAll();
}
