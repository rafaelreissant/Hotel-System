package org.example.Domain.entity;

import org.example.Domain.entity.enums.Role;

public class Employee {
    private String username;
    private String password;
    private Role role;

    public Employee(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
