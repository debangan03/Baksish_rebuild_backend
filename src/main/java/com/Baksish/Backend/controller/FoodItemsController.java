package com.Baksish.Backend.controller;

import com.Baksish.Backend.model.FoodItems;
import com.Baksish.Backend.service.FoodItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FoodItemsController {

    @Autowired
    private FoodItemsService foodItemsService;

    @PostMapping("/add-menu")
    public ResponseEntity<?> addNewMenu(@RequestBody FoodItems foodItem) {
        if (foodItemsService.saveNewFoodItem(foodItem)) {
            return new ResponseEntity<>(HttpStatus.CREATED);

        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
