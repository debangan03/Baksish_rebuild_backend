package com.Baksish.Backend.model;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document
@Data
public class JournalEntry {
    @Id
    private ObjectId id;
    private String title;
    private String description;
    private String img;
    private LocalDate date;
}
