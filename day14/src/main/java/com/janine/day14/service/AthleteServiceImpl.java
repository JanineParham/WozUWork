package com.janine.day14.service;

import com.janine.day14.model.Athlete;
import com.janine.day14.repo.AthleteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AthleteServiceImpl implements AthleteService{

    @Autowired
    AthleteRepo athleteRepo;

    @Override
    public Optional<Athlete> getAthleteById(Long id) {
        return athleteRepo.findById(id);
    }

    @Override
    public Athlete getAthleteByFirstName(String firstName) {
        return null;
    }

    @Override
    public void saveAthlete(Athlete athlete) {
        athleteRepo.save(athlete);
    }

    @Override
    public Optional<Athlete> updateAthlete(Athlete newAthlete, Long id){
        athleteRepo.findById(id)
                .map(athlete -> {
                    athlete.setFirstName(newAthlete.getFirstName());
                    athlete.setLastName(newAthlete.getLastName());
                    athlete.setSport(newAthlete.getSport());
                    athlete.setTeam(newAthlete.getTeam());
                    return athleteRepo.save(athlete);
                });
        return athleteRepo.findById(id);
    }

    @Override
    public void removeAthlete(Long id) {
        athleteRepo.deleteById(id);
    }
}
