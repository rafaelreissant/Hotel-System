package org.example.Domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> roomList = new ArrayList<>();
    private List<Reserve> reserveList = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public List<Reserve> getReserveList() {
        return reserveList;
    }

    @Override
    public String toString() {
        return "Welcome! " +  "Hotel: " + name;
    }
}