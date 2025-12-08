package org.example.Domain.entity;

import org.example.Domain.entity.enums.RoomCategory;

public class Room {
    private static int count = 1;
    private Integer Id;
    private Integer number;
    private Integer people;
    private boolean free;
    private RoomCategory roomCategory;

    public Room(Integer number, Integer people, boolean free, RoomCategory roomCategory) {
        Id = count++;
        this.number = number;
        this.people = people;
        this.free = free;
        this.roomCategory = roomCategory;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(RoomCategory roomCategory) {
        this.roomCategory = roomCategory;
    }

    @Override
    public String toString() {
        return "Room: " + "number: " + number + ", people: " + people;
    }
}
