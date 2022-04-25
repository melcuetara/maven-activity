package com.activity.vehicle;

public class Vehicle {
    
    private String vehicleName = "";
    private double gasConsumption;
    private double gas;
    private double engine;
    private int wheelCount;
    
    public Vehicle(double gasConsumption, double gas, double engine, int wheelCount) {
        this.gasConsumption = gasConsumption;
        this.gas = gas;
        this.engine = engine;
        this.wheelCount = wheelCount;
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

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
}
