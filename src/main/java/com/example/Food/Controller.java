package com.example.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
    private FoodService foodService;
	@GetMapping("/greeting")
    public String breakfast() {
        return "Enjoy your breakfast! 🍳🥞🥓";
    }
	
    @PostMapping
    public Food addPerson(@RequestBody Food food) {
        return foodService.savePerson(food);
    }

    
    
    
    @GetMapping
    public Iterable<Food> getAllFoods() {
        return foodService.getAllFoods();
    }
}
