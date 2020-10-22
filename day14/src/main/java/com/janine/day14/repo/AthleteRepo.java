package com.janine.day14.repo;

import com.janine.day14.model.Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepo extends CrudRepository<Athlete, Long> {
}
