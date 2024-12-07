package com.Baksish.Backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Restaurant {
    @Id
    private ObjectId restaurant_id;
    private String restaurant_name;
    private String restaurant_phone;
    private String restaurant_address;
    private String restaurant_email;
    private String cgst;
    private String sgst;
    private String restaurant_image;
    private String restaurant_info;
    @DBRef
    private RestaurantMenuItems restaurant_menu_items;
    @DBRef
    private RestaurantPaymentInfo restaurant_payment_info;
}
