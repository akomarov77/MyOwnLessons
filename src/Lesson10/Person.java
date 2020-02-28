package Lesson10;

import java.awt.*;
import java.time.LocalDate;
import java.util.Objects;

public class Person {

    public String name;
    public int age;
    public Gender gender;
    private String secondName;
    private LocalDate birthday;

    public Person(String name, int age, Gender gender, String secondName, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.secondName = secondName;
        this.birthday = birthday;
    }

    public Person(String name, int age, Gender gender, String secondName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.secondName = secondName;
    }

    public Person(String name, int age, Gender gender) {
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
