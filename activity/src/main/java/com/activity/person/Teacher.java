package com.activity.person;

public class Teacher extends Person{

    private String degreeLevel;

    public Teacher(String firstName, String lastName, String location, int age, String degreeLevel) {
        super(firstName, lastName, location, age);
        this.degreeLevel = degreeLevel;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }  
}
