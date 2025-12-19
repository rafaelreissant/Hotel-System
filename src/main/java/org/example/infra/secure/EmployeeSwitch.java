package org.example.infra.secure;

import org.example.Domain.entity.enums.Role;
import org.example.Domain.entity.factory.StafFactory;
import org.example.Domain.entity.strategy.interfaces.EmployeeFlowStrategy;
import org.example.Domain.entity.strategy.strategyFlow.ManagerFlowStrategy;
import org.example.Domain.entity.strategy.strategyFlow.StaffFlowStrategy;
import org.example.infra.secure.manager.ManagerAuthenticate;
import org.example.infra.secure.staff.StaffAuthenticate;

import java.util.Scanner;

public class EmployeeSwitch {

    private final StaffAuthenticate staffAuthenticate;
    private final ManagerAuthenticate managerAuthenticate;
    private final Scanner scanner = new Scanner(System.in);

    public EmployeeSwitch(StaffAuthenticate staffAuthenticate, ManagerAuthenticate managerAuthenticate) {
        this.staffAuthenticate = staffAuthenticate;
        this.managerAuthenticate = managerAuthenticate;
    }


    public void executeMenuLogin() {

        while (true) {
            System.out.println("\n--- USER MENU ---");
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int option = readInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> handleRegister();
                case 2 -> handleLogin();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option, try again.");
            }
        }
    }

    // ===========================
    // Registration Flow
    // ===========================
    private void handleRegister() {
        System.out.print("Enter desired username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Role role = readAccessLevel();
        if (role == null) return;

        switch (role) {
            case MANAGER -> managerAuthenticate.registerManager(username, password, role);
            case STAFF -> staffAuthenticate.registerStaff(username, password, role);
            default -> System.out.println("Invalid access level.");
        }
    }

    private void handleLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Role role = readAccessLevel();
        if (role == null) return;

        switch (role) {
            case MANAGER -> loginManager(username, password);
            case STAFF -> loginStaff(username, password);
            default -> System.out.println("Invalid access level.");
        }
    }

    private void loginManager(String username, String password) {
        if (managerAuthenticate.logManager(username, password) != null) {
            EmployeeFlowStrategy strategy =
                    new ManagerFlowStrategy(username, managerAuthenticate.getRepository());

            strategy.executeMenu();
        } else {
            System.out.println("Login failed. Try again.");
        }
    }

    private void loginStaff(String username, String password) {
        StafFactory loggedEmployee = staffAuthenticate.logStaff(username, password);

        if (loggedEmployee != null) {
            EmployeeFlowStrategy strategy = new StaffFlowStrategy(
                    username,
                    staffAuthenticate.getRepository()
            );
            strategy.executeMenu();
        } else {
            System.out.println("Login failed. Try again.");
        }
    }


    private int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input, enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private Role readAccessLevel() {
        System.out.print("Enter COMPANY or EMPLOYEE: ");
        String levelInput = scanner.nextLine().trim().toUpperCase();

        try {
            return Role.valueOf(levelInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid access level. Must be COMPANY or EMPLOYEE.");
            return null;
        }
    }
}