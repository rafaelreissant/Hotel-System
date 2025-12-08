package org.example.Domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Reserve {
    private static int count = 1;
    private Integer Id;
    private boolean status;

    private Guest guest;
    private Room room;
    private CheckIn checkIn;
    private List<Consuptiom> roomList = new ArrayList<>();

    public Reserve(boolean status, Guest guest, Room room, CheckIn checkIn, List<Consuptiom> roomList) {
        Id = count++;
        this.status = status;
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.roomList = roomList;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public CheckIn getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

    public List<Consuptiom> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Consuptiom> roomList) {
        this.roomList = roomList;
    }
}