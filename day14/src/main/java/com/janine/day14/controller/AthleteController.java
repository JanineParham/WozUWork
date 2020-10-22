package com.janine.day14.controller;

import com.janine.day14.model.Athlete;
import com.janine.day14.service.AthleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AthleteController {

    @Autowired
    AthleteServiceImpl athleteServiceImpl;

    //getMethod
    @GetMapping("/get/athlete/{id}")
    public Optional<Athlete> getAthleteById(@PathVariable Long id){
        return athleteServiceImpl.getAthleteById(id);
    }

    //saveMethod
    @PostMapping("/post/athlete")
    public void saveAthlete(@RequestBody Athlete athlete){
        athleteServiceImpl.saveAthlete(athlete);
    }

    @PutMapping("/put/athlete/{id}")
    public Optional<Athlete> updateAthlete(@RequestBody Athlete athlete, @PathVariable Long id){
        return athleteServiceImpl.updateAthlete(athlete, id);
    }

    @DeleteMapping("/delete/athlete/{id}")
    public String deletAthlete(@PathVariable Long id){
        athleteServiceImpl.removeAthlete(id);
        return "athlete deleted";
    }

}
