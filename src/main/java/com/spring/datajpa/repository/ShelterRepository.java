package com.spring.datajpa.repository;

import com.spring.datajpa.model.Shelter;
import org.springframework.data.repository.CrudRepository;

public interface ShelterRepository extends CrudRepository<Shelter, Integer> {
}
