package com.activity;

import com.activity.person.Student;
import com.activity.person.Teacher;
import com.activity.vehicle.Bike;
import com.activity.vehicle.Car;
import java.util.Random;
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

    private static Student student;
    private static String[] firstNameArr = {"Jamaica", "Reina", "Mel", "Allen", "Jake", "Christian", "Francis", "Andrie"};
    private static String[] lastNameArr = {"dela Cruz", "Garcia", "Reyes", "Reyes", "Gonzales", "Flores", "Lopez", "Perez"};

    public static void main(String[] args) {
        Student student1 = new Student("Mel", "Allen", 22, 4);
        Teacher teacher1 = new Teacher("Edsel", "Paray", 70, "Master's Degree");
        Car car1 = new Car(4, 100, 50);
        Bike bike1 = new Bike(2, 150, 40);


        System.out.println("\nStudent============================++++======================");
        System.out.println("Name:    " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Age :    " + student1.getAge());
        System.out.println("Year:    " + student1.getYear());
        System.out.println("\nTeacher============================++++=====================");
        System.out.println("Name:    " + teacher1.getFirstName() + " " + teacher1.getLastName());
        System.out.println("Age :    " + teacher1.getAge());
        System.out.println("Year:    " + teacher1.getDegreeLevel());
        System.out.println("\nCar================================++++======================");
        System.out.println("Wheel Count  :    " + car1.getWheelCount());
        System.out.println("Engine Power :    " + car1.getEngine() + "CC");
        System.out.println("Storage Cap  :    " + car1.getStorageCapacity() + "Kg");
        System.out.println("\nBike===============================++++======================");
        System.out.println("Wheel Count    :    " + bike1.getWheelCount());
        System.out.println("Engine Power   :    " + bike1.getEngine() + "CC");
        System.out.println("Wheelie Power  :    " + bike1.getWheeliePower() + "CC");
        generateStudent();
        Random random = new Random();
        random.nextInt(1, 4);
        random.nextInt(1, 4);
        random.nextInt(1, 4);
        random.nextInt(1, 4);
        random.nextInt(1, 4);
        random.nextInt(1, 4);
    }

    public static void generateStudent() {

        Random random = new Random();
        student = new Student(firstNameArr[random.nextInt(firstNameArr.length)], lastNameArr[random.nextInt(lastNameArr.length)], 50, random.nextInt(1, 4));
        System.out.println(student.getFirstName() + " " + student.getLastName());
    }
}
