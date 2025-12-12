package org.example.Domain.entity;

import java.util.UUID;

public class Consumption {
    private final String id = UUID.randomUUID().toString();
    private String Description;
    private double value;

    public Consumption(String description, double value) {

        Description = description;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return Description;
    }

    public double getValue() {
        return value;
    }

}