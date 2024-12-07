package com.Baksish.Backend.model;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class OrderItems {
    @Id
    private ObjectId order_item_id;
    @DBRef
    private RestaurantMenuItems restaurant_menu_item_id;
    private String quantity;
}
