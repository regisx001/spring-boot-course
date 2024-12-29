package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Meal;
import com.example.demo.repositories.MealRepository;

@Service
public class MealService {
    @Autowired
    private MealRepository mealRepository;

    public Meal createMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getAllMeal() {
        return mealRepository.findAll();
    }

    public Meal getMealById(Long id) {
        return mealRepository.findById(id).orElse(null);
    }

    public Meal updateMeal(Long id, Meal meal) {
        meal.setId(id);
        return mealRepository.save(meal);
    }

    public void deleteMeal(Long id) {
        mealRepository.deleteById(id);
    }

}
