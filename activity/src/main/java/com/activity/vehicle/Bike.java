package com.activity.vehicle;

public class Bike extends Vehicle{
    
    private double wheeliePower;

    public Bike(int wheelCount, double engine, double wheeliePower) {
        super(wheelCount, engine);
        this.wheeliePower = wheeliePower;
    }

    public double getWheeliePower() {
        return wheeliePower;
    }

    public void setWheeliePower(double wheeliePower) {
        this.wheeliePower = wheeliePower;
    }
}
