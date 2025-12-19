package org.example.Domain.entity;

import org.example.Domain.entity.enums.RoomCategory;
import org.example.Domain.entity.enums.RoomStatus;

import java.util.UUID;

public class Room {
    private final String id = UUID.randomUUID().toString();
    private Integer number;
    private Integer people;
    private RoomStatus roomStatus;
    private RoomCategory roomCategory;

    public Room(Integer number, Integer people, RoomStatus roomStatus, RoomCategory roomCategory) {
        this.number = number;
        this.people = people;
        this.roomStatus = RoomStatus.FREE;
        this.roomCategory = roomCategory;
        checkPeople();
        checkRoomNumber();
    }

    public void checkPeople(){
        if (people < 1){
            throw new RuntimeException("There must be at least 1 person in the room");
        }
    }

    public void checkRoomNumber(){
        if (number <= 0){
            throw new RuntimeException("Room number must begin with 1");
        }
    }

    public String getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getPeople() {
        return people;
    }

    public RoomStatus getRoomStatus() { return roomStatus;}

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    @Override
    public String toString() {
        return "Room: " + "number: " + number + ", people: " + people;
    }
}
