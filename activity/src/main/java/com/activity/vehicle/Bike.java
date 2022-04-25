package com.activity.vehicle;

public class Bike extends Vehicle{
    
    private double wheeliePower;

    public Bike(double gasConsumption, double gas, double engine, int wheelCount, double wheeliePower) {
        super(gasConsumption, gas, engine, wheelCount);
        this.wheeliePower = wheeliePower;

    }

    public double getWheeliePower() {
        return wheeliePower;
    }

    public void setWheeliePower(double wheeliePower) {
        this.wheeliePower = wheeliePower;
    }
}
