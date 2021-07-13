package com.home.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Addres {
    private String country;
    private String city;

    public Addres(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Addres{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}



