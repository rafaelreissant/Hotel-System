package org.example.infra.repository;

import org.example.Domain.entity.factory.StafFactory;

import java.util.HashMap;
import java.util.Map;

public class StaffRepository {
    private static final Map<String, StafFactory> staffs = new HashMap<>();

    public void addStaff(StafFactory stafFactory){
        if (staffs.containsValue(stafFactory.getUsername())){
            throw new RuntimeException("Name already in use");
        }
        staffs.put(stafFactory.getUsername(), stafFactory);
        System.out.println("Staff added with success");
    }

    public StafFactory searchStaff(String staff){
        return staffs.get(staff);
    }

    public boolean authenticateStaff(String name, String password){
        StafFactory stafFactory = staffs.get(name);
        if (staffs.containsValue(staffs.get(name))){
            throw new RuntimeException("Staff already created");
        }
        if (staffs.containsValue(staffs.get(password))){
            throw new RuntimeException("Staff already created");
        }
        return stafFactory != null && stafFactory.getPassword().equals(password);
    }
}
