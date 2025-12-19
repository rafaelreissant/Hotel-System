package org.example;

import org.example.infra.repository.ManagerRepository;
import org.example.infra.repository.StaffRepository;
import org.example.infra.secure.EmployeeSwitch;
import org.example.infra.secure.manager.ManagerAuthenticate;
import org.example.infra.secure.staff.StaffAuthenticate;

public class Main {
    public static void main(String[] args) {
        ManagerRepository managerRepository = new ManagerRepository();
        StaffRepository staffRepository = new StaffRepository();

        ManagerAuthenticate managerAuthenticate = new ManagerAuthenticate(managerRepository);
        StaffAuthenticate staffAuthenticate = new StaffAuthenticate(staffRepository);

        EmployeeSwitch employeeSwitch = new EmployeeSwitch(staffAuthenticate, managerAuthenticate);

        employeeSwitch.executeMenuLogin();
    }
}