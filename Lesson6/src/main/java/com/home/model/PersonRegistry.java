package com.home.model;

public class PersonRegistry {
    private Person[] person; //массив случайных людей

    public PersonRegistry(Person[] people) {
        this.person = people;
    }


    public int countPeople(Addres addres) { // проживающие в городе Минск
        int count = 0;
        for (int i = 0; i < person.length; i++) {
            Addres personsAddress = person.getAddres();
            if (personsAddress.getCountry().equals(addres.getCountry()) &&
                    personsAddress.getCity().equals(addres.getCity())) {
                count++;
            }
        }
        return count;
    }

    public





