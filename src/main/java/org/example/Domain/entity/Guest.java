package org.example.Domain.entity;

import java.util.UUID;

public class Guest {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private String telephone;
    private String email;

    public Guest(String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Welcome! " +  "Guest: " + name;
    }
}
