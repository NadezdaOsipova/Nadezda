package com.home.model;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


public class Person {


    private String name;
    private int age;
    private String sex;
    private Address address;

    public static int countPerson;

    static {
        countPerson = 0;
    }

    public Person(String name, int age, String sex, Address address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public Person() {
        this.age = age;
        this.address = address;
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
                ", addres=" + address +
                '}';
    }
//    class PersonRegistry {
//
//    }
}
