package org.example.Domain.entity.strategy.strategyFlow;

import org.example.Domain.entity.factory.ManagerFactory;
import org.example.Domain.entity.strategy.interfaces.EmployeeFlowStrategy;
import org.example.infra.repository.ManagerRepository;

public class ManagerFlowStrategy implements EmployeeFlowStrategy {

    private final String username;
    private final ManagerRepository repo;

    public ManagerFlowStrategy(String username, ManagerRepository repo) {
        this.username = username;
        this.repo = repo;
    }

    @Override
    public void executeMenu() {
        ManagerFactory managerFactory = repo.searchManager(username);

        if (managerFactory == null) {
            System.out.println("Employee not found in repository.");
            return;
        }

        new EmployeeMenuSwitch(employee, repo).executeMainMenu();
    }
}
