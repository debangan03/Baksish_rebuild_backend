package com.Baksish.Backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
public class RestaurantMenuItems {
    @Id
    private ObjectId restaurant_menu_item_id;
    @DBRef
    private FoodItems food_item_id;
    private String food_item_price;
    @DBRef
    private ArrayList<Restaurant_Individual_Item_Inventory> food_item_inventory=new ArrayList<>();
}
