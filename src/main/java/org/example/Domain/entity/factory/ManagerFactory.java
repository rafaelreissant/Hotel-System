package org.example.Domain.entity.factory;

import org.example.Domain.entity.Room;
import org.example.Domain.entity.enums.Role;
import org.example.Domain.entity.factory.source.EmployeeFactory;

import java.util.ArrayList;
import java.util.List;

public class ManagerFactory  extends EmployeeFactory {

    private List<Room> roomList = new ArrayList<>();

    public ManagerFactory(String username, String password, Role role) {
        super(username, password, role);
    }

    public List<Room> getRoomList() {
        return roomList;
    }
}
