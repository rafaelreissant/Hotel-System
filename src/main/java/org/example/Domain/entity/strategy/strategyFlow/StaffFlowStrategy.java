package org.example.Domain.entity.strategy.strategyFlow;

import org.example.Domain.entity.factory.ManagerFactory;
import org.example.Domain.entity.factory.StafFactory;
import org.example.Domain.entity.strategy.interfaces.EmployeeFlowStrategy;
import org.example.infra.repository.ManagerRepository;
import org.example.infra.repository.StaffRepository;

public class StaffFlowStrategy implements EmployeeFlowStrategy {

    private final String username;
    private final StaffRepository repo;

    public StaffFlowStrategy(String username, StaffRepository repo) {
        this.username = username;
        this.repo = repo;
    }

    @Override
    public void executeMenu() {
        StafFactory stafFactory = repo.searchStaff(username);

        if (stafFactory == null) {
            System.out.println("Employee not found in repository.");
            return;
        }

        new EmployeeMenuSwitch(employee, repo).executeMainMenu();
    }
}
