package com.Baksish.Backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
@NoArgsConstructor
public class UserEntry {
    @Id
    private ObjectId id;
    @Indexed(unique=true)
    @NonNull
    private String username;
    @NonNull
    private String password;
    @DBRef
    private List<JournalEntry> Journals= new ArrayList<>();
    private List<String> roles;
}
