package org.example.entity;

public class Consuptiom {
    private static int count = 1;
    private Integer Id;
    private String Description;
    private double value;

    public Consuptiom(String description, double value) {
        Id = count++;
        Description = description;
        this.value = value;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}