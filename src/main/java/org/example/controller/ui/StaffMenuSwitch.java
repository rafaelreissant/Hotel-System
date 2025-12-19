package org.example.controller.ui;

import org.example.Domain.entity.factory.ManagerFactory;
import org.example.Domain.entity.factory.StafFactory;
import org.example.infra.repository.ManagerRepository;
import org.example.infra.repository.StaffRepository;

import java.util.Scanner;

public class StaffMenuSwitch {

    private final StafFactory stafFactory;
    private final StaffRepository repository;

    public StaffMenuSwitch(StafFactory stafFactory, StaffRepository repository) {
        this.stafFactory = stafFactory;
        this.repository = repository;
    }


    public void executeMainMenu() {
        Scanner scanner = new Scanner(System.in);

        CompanyService service = new CompanyService(repository);

        while (true) {
            System.out.println("\n---  MENU COMPANY: " + company.getName() + " ---");
            System.out.println("1. Create votation");
            System.out.println("2. List votations");
            System.out.println("3. Exit");
            System.out.print("Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Voting title: ");
                    String title = scanner.nextLine();

                    System.out.print("Voting description: ");
                    String description = scanner.nextLine();

                    service.createVotation(title, description);
                    System.out.println("Voting added successfully!");
                }

                case 2 -> service.listVotings();

                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}