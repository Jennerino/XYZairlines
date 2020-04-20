package com.newairportjennerino.XYZairlines.controller;

import com.newairportjennerino.XYZairlines.model.Airplane;
import com.newairportjennerino.XYZairlines.repositories.AirplaneRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airplane")
public class AirplaneController {

    private final AirplaneRepository airplaneRepository;

    public AirplaneController(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createAirplane(@RequestBody Airplane airplane) {
        this.airplaneRepository.save(airplane);
    }

    @RequestMapping(value = "ready", method = RequestMethod.GET)

    public void ready(){

        Airplane plane1 = new Airplane("FalconXYZ");
        Airplane plane2 = new Airplane("millenniumXYZ");
        Airplane plane3 = new Airplane("OrlanXYZ");


    }
}