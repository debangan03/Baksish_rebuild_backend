package com.Baksish.Backend.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document
@Data


public class Restaurant_Individual_Item_Inventory {
    @Id
    private ObjectId individual_item_inventory_id;
    @DBRef
    private InventoryItems inventory_item;
    private String item_unit;
    private String item_amount;
    private Date last_renewal_date;
    private String last_renewal_amount;
    private String last_day_remaining_amount;
    @DBRef
    private ArrayList<InventoryDailyData> day_data=new ArrayList<>();
}
