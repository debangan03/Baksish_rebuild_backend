package com.Baksish.Backend.repository;

import com.Baksish.Backend.model.FoodItems;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodItemsRepo extends MongoRepository<FoodItems, ObjectId> {
}
