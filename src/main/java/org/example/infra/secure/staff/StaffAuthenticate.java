package org.example.infra.secure.staff;

import org.example.Domain.entity.enums.Role;
import org.example.Domain.entity.factory.StafFactory;
import org.example.infra.repository.StaffRepository;

public class StaffAuthenticate {

    private final StaffRepository staffRepository;

    public StaffAuthenticate(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public StaffRepository getRepository() {
        return this.staffRepository;
    }

    public StafFactory registerStaff(String name, String password, Role level) {
        if (staffRepository.searchStaff(name) != null) {
            System.out.println("Username already exists. Please choose another.");
            return null;
        }
        StafFactory stafFactory = new StafFactory(name, password);

        staffRepository.addStaff(stafFactory);

        System.out.println("Registration successful! " + stafFactory);
        return stafFactory;
    }

    public StafFactory logStaff(String name, String password) {
        if(staffRepository.authenticateStaff(name, password)) {
            StafFactory stafFactory = staffRepository.searchStaff(name);
            StaffSection.setStaffLog(stafFactory);
            System.out.println("Login successful! Welcome, " + stafFactory.getUsername() + ".");
            return stafFactory;
        } else {
            System.out.println("Invalid company or password.");
            return null;
        }
    }
}