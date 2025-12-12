package org.example.Domain.entity;

import org.example.Domain.entity.enums.RoomCategory;

import java.util.UUID;

public class Room {
    private final String id = UUID.randomUUID().toString();
    private Integer number;
    private Integer people;
    private boolean free;
    private RoomCategory roomCategory;

    public Room(Integer number, Integer people, boolean free, RoomCategory roomCategory) {
        this.number = number;
        this.people = people;
        this.free = free;
        this.roomCategory = roomCategory;
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

    public boolean isFree() {
        return free;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    @Override
    public String toString() {
        return "Room: " + "number: " + number + ", people: " + people;
    }
}
