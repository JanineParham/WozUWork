package com.janine.day14.service;

import com.janine.day14.model.Athlete;

import java.util.Optional;

public interface AthleteService {

    Optional<Athlete> getAthleteById(Long id);

    Athlete getAthleteByFirstName(String firstName);

    Optional<Athlete> updateAthlete(Athlete newAthlete, Long id);

    void saveAthlete(Athlete athlete);

    void removeAthlete(Long id);
}
