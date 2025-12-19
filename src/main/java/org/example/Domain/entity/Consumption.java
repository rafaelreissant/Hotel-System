package org.example.Domain.entity;

import java.util.UUID;

public class Consumption {
    private final String id = UUID.randomUUID().toString();
    private String Description;
    private double value;

    public Consumption(String description, double value) {
        Description = description;
        this.value = value;
        checkValue();
    }

    public void checkValue(){
        if (value <= 0){
            throw new IllegalArgumentException("The value can't be lower or equal to zero");
        }
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