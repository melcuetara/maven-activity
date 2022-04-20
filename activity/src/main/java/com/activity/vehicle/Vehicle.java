package com.activity.vehicle;

public class Vehicle {
    
    private int wheelCount;
    private double engine;
    
    public Vehicle(int wheelCount, double engine) {
        this.wheelCount = wheelCount;
        this.engine = engine;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
