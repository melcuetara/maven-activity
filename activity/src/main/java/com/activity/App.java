package com.activity;

import java.util.Scanner;

import com.activity.person.*;
import com.activity.vehicle.*;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    static Scanner input = new Scanner(System.in);
    static Vehicle vehicle = new Vehicle(7.8, 60, 800, 4);
    static Vehicle[] vehicles = new Vehicle[3];
    static Person person = new Person("Mel Allen", "Cuetara", "Gorordo Avenue", 22);
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Student student = new Student("Christian", "Jake", "Lapu-Lapu City", 23, 4);
        Teacher teacher = new Teacher("Francis", "Andrie", "Cebu City", 40, "Master's Degree");
        Car car = new Car(7.8, 60, 800, 4, 50);
        Bike bike = new Bike(5.0, 30, 155, 2, 20);
        int menu = 0;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = new Vehicle(7.8, 60, 800, 4);
        }
        vehicles[0].setVehicleName("Rolls");
        vehicles[1].setVehicleName("Mustang");
        vehicles[2].setVehicleName("Phantom");
        System.out.println(vehicles[0].getVehicleName());
        printStudent(student);
        printTeacher(teacher);
        printCar(car);
        printBike(bike);
        
        do {
            System.out.println("MENU ===============");
            System.out.println("|1| Travel");
            System.out.println("|0| Exit");
            System.out.print("Choose: ");
            menu = input.nextInt();
            if (menu == 1) {
                input.nextLine();
                System.out.print("Enter Vechicle Name: ");
                String vehicleName = input.nextLine();
                for (int i = 0; i < vehicles.length; i++) {
                    if (vehicleName.equals(vehicles[i].getVehicleName())) {
                        System.out.println("Vehicle Found!");
                        travel(vehicles[i]);
                        break;
                    } else if (i == 2) {
                        System.out.println("Vehicle not Found!");
                    }
                }
                
            }
        } while (menu != 0);
        input.close();
    }

    public static void travel(Vehicle vehicles) {
        String location;
        Double distance; 
        System.out.print("Enter location: ");
        location = input.nextLine();
        System.out.print("Enter distance (Km): ");
        distance = input.nextDouble();
        if(isGasSufficient(vehicle.getGas(), distance)) {
            vehicle.setGas(vehicle.getGas() - computeGasUsed(vehicle.getGasConsumption(), distance));
            person.setLocation(location);
            System.out.println("Vehicle used: " + vehicle.getVehicleName());
            System.out.println(person.getFirstName() + " " + person.getLastName() + " new location: " + person.getLocation());
            System.out.println("Gas consumed: " + String.format("%.2f", computeGasUsed(vehicle.getGasConsumption(), distance)));
            System.out.println("New gas: " + String.format("%.2f", vehicle.getGas()));
        } else {
            System.out.println("Gas is Insufficient!");
        }
    }

    public static double computeGasUsed(double gasConsumption, double distance) {
        return distance / gasConsumption;
    }

    public static boolean isGasSufficient(double gas, double distance) {
        if (gas < computeGasUsed(vehicle.getGasConsumption(), distance)) {
            return false;
        }
        return true;
    }

    public static void printStudent(Student student) {
        System.out.println("Person ==============================");
        System.out.println("Name: " + student.getLastName() + ", " + student.getFirstName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Year Level: " + student.getYear());
        System.out.println();
    }
    public static void printTeacher(Teacher teacher) {
        System.out.println("Teacher ==============================");
        System.out.println("Name: " + teacher.getLastName() + ", " + teacher.getFirstName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Degree Level: " + teacher.getDegreeLevel());
        System.out.println();
    }
    public static void printCar(Car car) {
        System.out.println("Car ==============================");
        System.out.println("No of Wheels: " + car.getWheelCount());
        System.out.println("Engine Power: " + car.getEngine() + "CC");
        System.out.println("Storage Capacity: " + car.getStorageCapacity() + "Kg");
        System.out.println();
    }
    public static void printBike(Bike bike) {
        System.out.println("Bike ==============================");
        System.out.println("No of Wheels: " + bike.getWheelCount());
        System.out.println("Engine Power: " + bike.getEngine() + "CC");
        System.out.println("Wheelie Power: " + bike.getWheeliePower() + "CC");
        System.out.println();
    }
}
