package com.QAP3JavaQ1;

public class Teacher extends Person{

    protected String subject;
    protected double salary;


    public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {
        super(myName, myAge, myGender);
        this.subject = mySubject;
        this.salary = mySalary;
    }
    public String getSubject(){
        return subject;
    }
    public double getSalary(){
        return salary;
    }

    public void setSubject() {
        this.subject = subject;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public String toString() {return name + ", age: " + age + ", gender: " + gender + ", Subject: " + subject + ", Salary: " + salary;}
}

