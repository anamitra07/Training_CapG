package Ride_Booking_System;

/*******************************

 Created By: Anamitra Kanjilal
 Date: 11-05-2025
 Time: 16:49
 ********************************/
public abstract class User {
    protected String id;
    protected String name;

    User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void showProfile();
}
