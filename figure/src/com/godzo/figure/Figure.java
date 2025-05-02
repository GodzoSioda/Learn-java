package com.godzo.figure;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                ", area= " + this.getArea() +
                '}';
    }
}
