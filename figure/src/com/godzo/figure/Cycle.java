package com.godzo.figure;

public class Cycle extends Figure {

    private int radius;

    public Cycle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
