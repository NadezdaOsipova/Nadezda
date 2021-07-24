package com.home.model;

public class PersonRegistry {
    private static final int MIN_AGE_PERSON = 18;
    private static final int MAX_AGE_PERSON = 27;
    private static final String SEX_PERSON = "MALE";

    private final Person[] persons; //массив случайных людей

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public int countPeople(Address address) { // проживающие в городе Минск
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            Address personsAddress = persons[i].getAddress();
            if (personsAddress.getCountry().equalsIgnoreCase(address.getCountry()) &&
                    personsAddress.getCity().equalsIgnoreCase(address.getCity())) {
                count++;
            }
        }
        return count;
    }

    public int countPeopleAlex(String name) { //  с именем Аlex
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getName().equalsIgnoreCase(name)) {
                return count;
            }
            count++;
            return count;
        }
        return count;
    }

    public int fitForService() { // годные к службе
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            int age1 = persons[i].getAge();
            if (age1 >= MIN_AGE_PERSON && age1 <= MAX_AGE_PERSON) {
                if (persons[i].getSex() == SEX_PERSON) {
                    count++;
                }
            }
        }
        return count;
    }

    public int fitForServiceMan() { // мужчины, годные к службе в возрасте от 25 до 27 лет
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            int age1 = persons[i].getAge();
            if (age1 >= 25 && age1 <= 27) {
                if (persons[i].getSex() == SEX_PERSON) {
                    count++;
                }
            }
        }
        return count;
    }
}





