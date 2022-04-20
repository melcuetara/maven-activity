package com.activity.vehicle;

public class Car extends Vehicle{
    
    private double storageCapacity;

    public Car(int wheelCount, double engine, double storageCapacity) {
        super(wheelCount, engine);
        this.storageCapacity = storageCapacity;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
