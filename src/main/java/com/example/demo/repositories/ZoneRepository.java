package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Long> {

}