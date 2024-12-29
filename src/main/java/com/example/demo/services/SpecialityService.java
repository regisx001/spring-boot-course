package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Speciality;
import com.example.demo.repositories.SpecialityRepository;

@Service
public class SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;

    public Speciality createSpeciality(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    public List<Speciality> getAllSpeciality() {
        return specialityRepository.findAll();
    }

    public Speciality getSpecialityById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    public Speciality updateSpeciality(Long id, Speciality speciality) {
        speciality.setId(id);
        return specialityRepository.save(speciality);
    }

    public void deleteSpeciality(Long id) {
        specialityRepository.deleteById(id);
    }

}
