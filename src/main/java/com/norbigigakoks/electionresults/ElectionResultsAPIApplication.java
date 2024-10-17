package com.norbigigakoks.electionresults;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.norbigigakoks.electionresults")
public class ElectionResultsAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectionResultsAPIApplication.class, args);
    }

}
