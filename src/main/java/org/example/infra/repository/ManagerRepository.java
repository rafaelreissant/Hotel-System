package org.example.infra.repository;

import org.example.Domain.entity.factory.ManagerFactory;

import java.util.HashMap;
import java.util.Map;

public class ManagerRepository {
    private static final Map<String, ManagerFactory> managers = new HashMap<>();

    public boolean addManager(ManagerFactory managerFactory){
        if (managers.containsValue(managerFactory.getUsername())){
            throw new RuntimeException("Name already in use");
        }
        managers.put(managerFactory.getUsername(), managerFactory);
        System.out.println("Manager added with success");
        return true;
    }

    public ManagerFactory searchManager(String manager){
        return managers.get(manager);
    }

    public boolean authenticateManager(String name, String password){
        ManagerFactory managerFactory = managers.get(name);

        return managerFactory != null && managerFactory.getPassword().equals(password);
    }
}