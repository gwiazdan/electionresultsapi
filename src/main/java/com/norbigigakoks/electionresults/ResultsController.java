package com.norbigigakoks.electionresults;

import com.norbigigakoks.electionresults.dto.CountyVoteSummary;
import com.norbigigakoks.electionresults.dto.SenateVoteSummary;
import com.norbigigakoks.electionresults.dto.VoivodeshipVoteSummary;
import com.norbigigakoks.electionresults.units.Municipality;
import com.norbigigakoks.electionresults.units.Territory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://localhost:5173")
public class ResultsController {

    private final MunicipalityRepository municipalityRepository;
    private final TerritoriesRepository territoriesRepository;
    private final SenateService senateService;
    @Autowired
    public ResultsController(MunicipalityRepository municipalityRepository, TerritoriesRepository territoriesRepository, SenateService senateService) {
        this.municipalityRepository = municipalityRepository;
        this.territoriesRepository = territoriesRepository;
        this.senateService = senateService;
    }

    @GetMapping("/municipalities")
    public List<Municipality> getAllMunicipalities(){
        return municipalityRepository.findAll();
    }

    @GetMapping("/counties")
    public List<CountyVoteSummary> getAllCounties() { return municipalityRepository.findCountyVoteSummary();}
    
    @GetMapping("/voivodeships")
    public List<VoivodeshipVoteSummary> getAllVoivodeships() {return municipalityRepository.findVoivodeshipVoteSummary();}

    @GetMapping("/territories")
    public List<Territory> getAllTerritories() {
        return territoriesRepository.findAll();
    }

    @GetMapping("/senate")
    public List<SenateVoteSummary> getSenateResults() {
        return senateService.getSenateResults();
    }

}
