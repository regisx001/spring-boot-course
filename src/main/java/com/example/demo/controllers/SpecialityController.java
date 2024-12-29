package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Speciality;
import com.example.demo.services.SpecialityService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/specialities")
public class SpecialityController {

    @Autowired
    private SpecialityService specialityService;

    @PostMapping
    public Speciality createSpeciality(@RequestBody Speciality speciality) {
        return specialityService.createSpeciality(speciality);
    }

    @GetMapping
    public List<Speciality> getAllSpecialitys() {
        return specialityService.getAllSpeciality();
    }

    @GetMapping("/{id}")
    public Speciality getSpecialityById(@PathVariable Long id) {
        return specialityService.getSpecialityById(id);
    }

    @PutMapping("/{id}")
    public Speciality updateSpeciality(@PathVariable Long id, @RequestBody Speciality speciality) {
        return specialityService.updateSpeciality(id, speciality);
    }

    @DeleteMapping("/{id}")
    public void deleteSpeciality(@PathVariable Long id) {
        specialityService.deleteSpeciality(id);
    }
}
