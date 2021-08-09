package com.hw2.clothes.person;

import com.hw2.clothes.person.Names;
import com.hw2.clothes.person.Person;
import com.hw2.clothes.Сlothes;

import java.util.ArrayList;

public class PersonFactory {

    private static int n;

    public Person createPerson() {
        int numberName = n % Names.values().length;

        String personName = Names.values()[numberName].toString();
        ArrayList<C> clothesList = new ArrayList<>();//проблема со списком


        return null;
    }
}
