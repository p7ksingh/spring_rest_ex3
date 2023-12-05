package com.infy.springrestput;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalControl {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospitals")
    public List<Hospital> getHospital() {

        return hospitalService.getHospitalLists();
    }

    @PutMapping("/hospital/{id}")
    public Hospital updateHospitalByPutUsingId(@RequestBody Hospital newHospital, @PathVariable int id) {

        return hospitalService.updateHospitalById(newHospital, id);
    }

    @PutMapping("/hospitals/{name}")
    public Hospital updateHospitalByPutUsingName(@RequestBody Hospital newHospital, @PathVariable String name) {

        return hospitalService.updateHospitalByName(newHospital, name);
    }
}
