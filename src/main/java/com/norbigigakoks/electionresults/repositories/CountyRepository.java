package com.norbigigakoks.electionresults.repositories;


import com.norbigigakoks.electionresults.units.County;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountyRepository extends JpaRepository<County, Long> {
}
