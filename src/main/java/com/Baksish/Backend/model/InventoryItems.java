package com.Baksish.Backend.model;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
public class InventoryItems {
    @Id
    private String inventory_item_id;
    @NonNull
    private String inventory_item_name;
    private String inventory_item_photo;
    @DBRef
    private ArrayList<FoodItems> items_used_in=new ArrayList<>();
}
