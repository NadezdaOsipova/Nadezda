package com.home.model;

public class PersonRegistry {
    private static final int MIN_AGE_PERSON = 18;
    private static final int MAX_AGE_PERSON = 27;
    private static final String SEX_PERSON = "MALE";

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

    public int countPeopleAlex(String name) { //  с именем Аlex
        int count1 = 0;
        for (int i = 0; i < person.length; i++) {
            if (person.getName().equals(name)) {
                return count1;
            }
            count1++;
            return count1;
        }
        return count1;
    }

    public int fitForService(int age, String sex) { // годные к службе
        int k = 0;
        for (int i = 0; i < person.length; i++) {
            if (age >= MIN_AGE_PERSON && age <= MAX_AGE_PERSON) {
                if (sex == SEX_PERSON) {
                    k++;
                }
                return k;
            }

        }

    }
}





