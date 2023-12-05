package com.infy.springrestput;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HospitalService {
    List<Hospital> hospitalList = new ArrayList<Hospital>(List.of(new Hospital(101, "AIIMS", "Delhi", 5.0),
            new Hospital(102, "PMCH", "Bihar", 3.0), new Hospital(105, "KIMS", "Bihar", 4.0),
            new Hospital(103, "KMCH", "Kerla", 3.5)));

    public List<Hospital> getHospitalLists() {
        return hospitalList;
    }

    public Hospital updateHospitalById(Hospital newHospital, int id) {
        Hospital oldHospital = hospitalList.stream().filter(hospital -> hospital.getId() == id).findFirst().get();
        oldHospital.setId(newHospital.getId());
        oldHospital.setName(newHospital.getName());
        oldHospital.setRating(newHospital.getRating());
        oldHospital.setLocation(newHospital.getLocation());
        return oldHospital;
    }

    public Hospital updateHospitalByName(Hospital newHospital, String name) {
        Hospital oldHospital = hospitalList.stream().filter(hospital -> hospital.getName().equals(name)).findFirst()
                .get();
        oldHospital.setRating(newHospital.getRating());
        return oldHospital;
    }
}
