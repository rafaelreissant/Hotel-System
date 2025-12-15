package org.example.Domain.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Reserve {
    private final String id = UUID.randomUUID().toString();
    private boolean status;

    private Guest guest;
    private Room room;
    private CheckIn checkIn;
    private List<Consumption> roomList = new ArrayList<>();

    public Reserve(boolean status, Guest guest, Room room, CheckIn checkIn) {
        this.status = status;
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
    }

    public boolean isStatus() {
        return status;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public List<Consumption> getRoomList() {
        return roomList;
    }
}