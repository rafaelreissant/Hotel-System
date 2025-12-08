package org.example.Domain.entity;

public class Guest {
    private static int count = 1;
    private Integer Id;
    private String name;
    private String password;
    private String telephone;
    private String email;

    public Guest(String name, String password, String telephone, String email) {
        Id = count++;
        this.name = name;
        this.password = password;
        this.telephone = telephone;
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Welcome! " +  "Guest: " + name;
    }
}
