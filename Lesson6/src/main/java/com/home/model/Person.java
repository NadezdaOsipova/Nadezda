package com.home.model;

public class Person {
private  String name;
private int age;
private String sex;
Addres addres;
public static int countPerson;

static {
    countPerson = 0;
    }

    {
        name = "Nins";
        age = 15;
        System.out.println(this);
        System.out.println("Блок инициализации");
           }

//    public Person() {
//    countPerson++;
//    }

    public Person(String name, int age, String sex, Addres addres) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
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
