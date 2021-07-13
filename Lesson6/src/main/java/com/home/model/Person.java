package com.home.model;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


public class Person {


    private String name;
    private int age;
    private String sex;
    private Addres addres;

    public static int countPerson;

    static {
        countPerson = 0;
    }


    public Person(String name, int age, String sex, Addres addres) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.addres = addres;
    }

    public Person() {
        this.age = age;
        this.addres = addres;
    }

    public void setAddres() {
        this.addres = addres;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", addres=" + addres +
                '}';
    }
//    class PersonRegistry {
//
//    }
}
