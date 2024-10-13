package com.norbigigakoks.electionresults;

import com.norbigigakoks.electionresults.dto.CountyVoteSummary;
import com.norbigigakoks.electionresults.units.County;
import com.norbigigakoks.electionresults.units.Municipality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResultsController {

    @Autowired
    private MunicipalityRepository municipalityRepository;

    @Autowired
    private CountyRepository countyRepository;

    @GetMapping("/municipalities")
    public List<Municipality> getAllMunicipalities(){
        return municipalityRepository.findAll();
    }

    @GetMapping("/counties")
    public List<CountyVoteSummary> getAllCounties() { return municipalityRepository.findCountyVoteSummary();}
}