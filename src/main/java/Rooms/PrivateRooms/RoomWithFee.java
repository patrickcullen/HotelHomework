package Rooms.PrivateRooms;

import Rooms.Guest;
import Rooms.Room;

import java.util.ArrayList;

public abstract class RoomWithFee extends Room {

    private double fee;
    private int capacity;
    private ArrayList<Guest> guests;

    public RoomWithFee(String name, String use, double fee, int capacity) {
        super(name, use);
        this.fee = fee;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public double getFee() {
        return fee;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
}
