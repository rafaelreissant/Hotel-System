package org.example.Domain.repository;

import org.example.Domain.entity.factory.ManagerFactory;

import java.util.HashMap;
import java.util.Map;

public class ManagerRepository {
    private static final Map<String, ManagerFactory> managers = new HashMap<>();

    public void addManager(ManagerFactory managerFactory, String name){
        if (managers.containsValue(managers.get(name))){
            throw new RuntimeException("Name already in use");
        }
        managers.put(managerFactory.getUsername(), managerFactory);
        System.out.println("Manager added with success");
    }

    public ManagerFactory searchManager(String manager){
        return managers.get(manager);
    }

    public boolean authenticateManager(String name, String password){
        ManagerFactory managerFactory = managers.get(name);
        if (managers.containsValue(managers.get(name))){
            throw new RuntimeException("Manager already created");
        }
        if (managers.containsValue(managers.get(password))){
            throw new RuntimeException("Manager already created");
        }
        return managerFactory != null && managerFactory.getPassword().equals(password);
    }
}
