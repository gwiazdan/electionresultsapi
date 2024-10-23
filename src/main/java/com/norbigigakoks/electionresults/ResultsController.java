package com.norbigigakoks.electionresults;

import com.norbigigakoks.electionresults.dto.*;
import com.norbigigakoks.electionresults.repositories.MunicipalityRepository;
import com.norbigigakoks.electionresults.repositories.TerritoriesRepository;
import com.norbigigakoks.electionresults.services.EuroService;
import com.norbigigakoks.electionresults.services.SejmService;
import com.norbigigakoks.electionresults.services.SejmikService;
import com.norbigigakoks.electionresults.services.SenateService;
import com.norbigigakoks.electionresults.units.Municipality;
import com.norbigigakoks.electionresults.units.Territory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    private final SejmService sejmService;
    private final SejmikService sejmikService;
    private final EuroService euroService;

    @Autowired
    public ResultsController(MunicipalityRepository municipalityRepository, TerritoriesRepository territoriesRepository, SenateService senateService, SejmService sejmService, SejmikService sejmikService, EuroService euroService) {
        this.municipalityRepository = municipalityRepository;
        this.territoriesRepository = territoriesRepository;
        this.senateService = senateService;
        this.sejmService = sejmService;
        this.sejmikService = sejmikService;
        this.euroService = euroService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("API is running");
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

    @GetMapping("/sejm")
    public List<SejmVoteSummary> getSejmResults() {
        return sejmService.getSejmResults();
    }

    @GetMapping("/sejmik")
    public List<SejmikVoteSummary> getSejmikResults() {
        return sejmikService.getSejmikResults();
    }

    @GetMapping("/euro")
    public List<EuroVoteSummary> getEuroResults() {
        return euroService.getEuroResults();
    }

}
