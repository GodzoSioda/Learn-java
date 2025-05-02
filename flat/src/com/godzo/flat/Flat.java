package com.godzo.flat;

public class Flat {

    private int area;
    private int roomsNumber;
    private int residentNumber;
    private String address;

    public Flat() {
    }

    public Flat(int area, int roomsNumber, int residentNumber, String address) {
        this.area = area;
        this.roomsNumber = roomsNumber;
        this.residentNumber = residentNumber;
        this.address = address;
    }

    public Flat(int area, int roomsNumber) {
        this.area = area;
        this.roomsNumber = roomsNumber;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", roomsNumber=" + roomsNumber +
                ", residentNumber=" + residentNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
