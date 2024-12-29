package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.City;
import com.example.demo.repositories.CityRepository;

@Service
public class CityService {
    private CityRepository cityRepository;

    @Autowired

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public List<City> getAllCity() {
        return cityRepository.findAll();
    }

    public City getCityById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City updateCity(Long id, City city) {
        city.setId(id);
        return cityRepository.save(city);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

}
