package com.spring.datajpa.controller;

import com.spring.datajpa.model.Shelter;
import com.spring.datajpa.repository.ShelterRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/shelters", produces = "application/json")
public class ShelterController {

    @Autowired
    private ShelterRepository shelterRepository;

    @ApiOperation(value = "Find shelter by shelter id.")
    @RequestMapping(value = "/{shelterId}", method = RequestMethod.GET)
    public Shelter getShelter(@PathVariable("shelterId") Integer shelterId) {
        return this.shelterRepository.findById(shelterId).get();
    }

    @ApiOperation(value = "Find all shelter.")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Shelter> getAllShelter() {
        return this.shelterRepository.findAll();
    }

    @ApiOperation(value = "Add a shelter.")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addShelter(@RequestBody Shelter shelter) {
        this.shelterRepository.save(shelter);
    }

    @ApiOperation(value = "Delete a shelter.")
    @RequestMapping(value = "/{shelterId}", method = RequestMethod.DELETE)
    public void deleteShelter(@PathVariable("shelterId") Integer shelterId) {
        this.shelterRepository.deleteById(shelterId);
    }

    @ApiOperation(value = "Update a shelter.")
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public void updateShelter(@RequestBody Shelter shelter) {
        this.shelterRepository.save(shelter);
    }
}
