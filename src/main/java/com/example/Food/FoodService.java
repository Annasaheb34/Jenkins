package com.example.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food savePerson(Food food) {
        return foodRepository.save(food);
    }

    public Iterable<Food> getAllFoods() {
        return foodRepository.findAll();
    }
}
