package com.tmt.TaskManagementTool.models;

import com.fasterxml.jackson.databind.JsonNode;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private ObjectId id;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    @DocumentReference
    private Role role;

    public Object getFirstname() {
        return null;
    }

    public Object getLastname() {
        return null;
    }

    public void setUsername(String userName) {
    }

    public void setEmail(String email) {
    }

    public void setPassword(String password) {
    }

    public void setFirstname(String firstName) {
    }

    public void setLastname(String lastName) {
    }

    public String getUsername() {
        return null;
    }

    public JsonNode getRole() {
        return null;
    }
}
