package com.QAP3JavaQ1;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String myName, int myAge, String myGender) {
        this.name = myName;
        this.age = myAge;
        this.gender = myGender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {return name + ", age: " + age + ", gender: " + gender;}
}