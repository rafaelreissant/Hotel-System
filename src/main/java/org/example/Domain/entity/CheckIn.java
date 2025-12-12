package org.example.Domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class CheckIn {
    private final String id = UUID.randomUUID().toString();
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public CheckIn(LocalDateTime checkIn, LocalDateTime checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

}
