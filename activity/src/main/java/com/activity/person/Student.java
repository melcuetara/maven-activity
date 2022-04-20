package com.activity.person;

public class Student extends Person{

    private int year;

    public Student(String firstName, String lastName, int age, int year) {
        super(firstName, lastName, age);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
     
}
