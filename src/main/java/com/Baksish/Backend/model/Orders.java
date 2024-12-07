package com.Baksish.Backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
public class Orders {
    @Id
    private ObjectId order_id;
    private ObjectId restaurant_id;
    private String customer_name;
    private String customer_phone;
    @DBRef
    private ArrayList<OrderItems> order_item=new ArrayList<>();
    private String customer_note;
    private String order_amount;
    private String order_quantity;
    private String total_amount;
    private String offer_amount;
    private Boolean isPaid;
    private String payment_amount;
    private String payment_mode;
}
