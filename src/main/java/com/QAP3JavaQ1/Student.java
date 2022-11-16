package com.QAP3JavaQ1;

public class Student  extends Person{

    protected String idNum;
    protected double gpa;
    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA) {
        super(myName, myAge, myGender);

        this.idNum = myIdNum;
        this.gpa = myGPA;
    }
    public String getIdNum(){
        return idNum;
    }

    public double getGpa(){
        return gpa;
    }

    public void setIdNum() {
        this.idNum = idNum;
    }

    public void setGpa() {
        this.gpa = gpa;
    }
    public String toString() {return super.toString() + ", IDNum: " + idNum + ", GPA: " + gpa;}
}


