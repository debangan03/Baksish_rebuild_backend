package com.Baksish.Backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class RestaurantPaymentInfo {
    @Id
    private ObjectId restaurant_payment_info;
    @DBRef
    private Restaurant restaurant_id;
    private String restaurant_name;
    private String payemnt_gateway;
    //other payment keys and details
}
