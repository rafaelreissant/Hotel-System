package org.example.Domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String password;

    private List<Room> roomList = new ArrayList<>();

    public Hotel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "Welcome! " +  "Hotel: " + name;
    }
}
