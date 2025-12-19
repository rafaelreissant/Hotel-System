package org.example.Domain.entity;

import org.example.Domain.entity.enums.ReservationStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Reserve {
    private final String id = UUID.randomUUID().toString();
    private ReservationStatus reservationStatus;

    private Guest guest;
    private Room room;
    private CheckIn checkIn;
    private List<Consumption> roomList = new ArrayList<>();

    public Reserve(ReservationStatus reservationStatus, Guest guest, Room room, CheckIn checkIn) {
        this.reservationStatus = reservationStatus;
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
    }

    public String getId() {return id;}

    public ReservationStatus getReservationStatus() {return reservationStatus;}

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