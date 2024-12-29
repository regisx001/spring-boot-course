package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}