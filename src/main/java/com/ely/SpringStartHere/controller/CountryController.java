package com.ely.SpringStartHere.controller;

import com.ely.SpringStartHere.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/India")
    public ResponseEntity<Country> India() {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("alias", "Bharat")
                .header("vision", "AkhandBharat")
                .body(Country.of("India", 135));
    }

    @GetMapping("/all")
    public List<Country> findAll() {
        return List.of(Country.of("India", 135), Country.of("Utopia", 2));
    }
}
