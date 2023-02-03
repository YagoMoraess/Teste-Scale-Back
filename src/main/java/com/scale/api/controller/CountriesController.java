package com.scale.api.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/countries")
public class CountriesController {
	
	@CrossOrigin
	@GetMapping
	public Optional<String> GetCountries() {
		RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<String> response = restTemplate.getForEntity("https://scale.com.br/countries.json", String.class);
	    return Optional.of(response.getBody());
	}
}
