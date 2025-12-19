package org.example.Domain.entity.factory;

import org.example.Domain.entity.Reserve;
import org.example.Domain.entity.enums.Role;
import org.example.Domain.entity.factory.source.EmployeeFactory;

import java.util.ArrayList;
import java.util.List;

public class StafFactory extends EmployeeFactory {

    private List<Reserve> reserveList = new ArrayList<>();

    public StafFactory(String username, String password) {
        super(username, password, Role.STAFF);
    }

    public List<Reserve> getReserveList() {
        return reserveList;
    }
}
