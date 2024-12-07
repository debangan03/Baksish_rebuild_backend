package com.Baksish.Backend.model;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
public class FoodItems {
    @Id
    private ObjectId food_item_id;
    @NonNull
    private String food_item_name;
    private String food_item_description;
    private String food_item_photo;
    @NonNull
    private String food_item_type;
    @NonNull
    private String food_item_category;
    @DBRef
    private ArrayList<Restaurant> restaurants_used_in = new ArrayList<>();
}