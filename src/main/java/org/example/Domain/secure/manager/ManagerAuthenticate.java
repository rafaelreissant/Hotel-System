package org.example.Domain.secure.manager;

import org.example.Domain.entity.enums.Role;
import org.example.Domain.entity.factory.ManagerFactory;
import org.example.Domain.repository.ManagerRepository;

public class ManagerAuthenticate {

    private final ManagerRepository managerRepository;

    public ManagerAuthenticate(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public ManagerRepository getRepository() {
        return this.managerRepository;
    }

    public ManagerFactory registerManager(String name, String password, Role level) {
        if (managerRepository.searchManager(name) != null) {
            System.out.println("Username already exists. Please choose another.");
            return null;
        }
        ManagerFactory managerFactory = new ManagerFactory(name, password);

        managerRepository.addManager(managerFactory);

        System.out.println("Registration successful! " + managerFactory);
        return managerFactory;
    }

    public ManagerFactory logManager(String name, String password) {
        if(managerRepository.authenticateManager(name, password)) {
            ManagerFactory managerFactory = managerRepository.searchManager(name);
            ManagerSection.setManagerLog(managerFactory);
            System.out.println("Login successful! Welcome, " + managerFactory.getUsername() + ".");
            return managerFactory;
        } else {
            System.out.println("Invalid company or password.");
            return null;
        }
    }
}