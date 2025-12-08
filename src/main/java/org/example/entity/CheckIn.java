package org.example.entity;

import java.time.LocalDateTime;

public class CheckIn {
    private static int count = 1;
    private Integer Id;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public CheckIn(LocalDateTime checkIn, LocalDateTime checkOut) {
        Id = count++;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
}
