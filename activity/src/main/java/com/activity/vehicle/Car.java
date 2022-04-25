package com.activity.vehicle;

public class Car extends Vehicle{
    
    private double storageCapacity;

    public Car(double gasConsumption, double gas, double engine, int wheelCount, double storageCapacity) {
        super(gasConsumption, gas, engine, wheelCount);
        this.storageCapacity = storageCapacity;
    }


    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
