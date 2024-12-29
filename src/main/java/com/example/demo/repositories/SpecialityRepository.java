package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}