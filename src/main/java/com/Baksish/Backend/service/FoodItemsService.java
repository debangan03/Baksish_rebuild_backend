package com.Baksish.Backend.service;

import com.Baksish.Backend.model.FoodItems;
import com.Baksish.Backend.repository.FoodItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FoodItemsService {

    @Autowired
    private FoodItemsRepo foodItemsRepo;

    public boolean saveNewFoodItem(FoodItems food){
        try{
            foodItemsRepo.save(food);
            return true;
        } catch (Exception e) {
            return  false;
        }


    }
}
