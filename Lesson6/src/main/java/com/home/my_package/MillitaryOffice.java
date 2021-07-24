package com.home.my_package;

import com.home.model.Address;
import com.home.model.Person;
import com.home.model.PersonRegistry;

import java.util.Arrays;


public class MillitaryOffice {

    public static void main(String[] args) {

        Address OlegAdress = new Address("Belarus", "Minsk");
        Person Oleg = new Person("Oleg", 15, "male", OlegAdress);

        Address AlexAdress = new Address("Russia", "Moscow");
        Person Alex = new Person("Alex", 25, "male", AlexAdress);

        Address IgorAdress = new Address("Belarus", "Minsk");
        Person Igor = new Person("Igor", 35, "male", IgorAdress);

        Address VasyaAdress = new Address("Belarus", "Minsk");
        Person Vasya = new Person("Vasya", 22, "male", VasyaAdress);

        Address InnaAdress = new Address("Belarus", "Minsk");
        Person Inna = new Person("Inna", 48, "female", InnaAdress);

        Address KonstantinAdress = new Address("Belarus", "Minsk");
        Person Konstantin = new Person("Konstantin", 27, "male", KonstantinAdress);

        Address ValentinAdress = new Address("Belarus", "Mogilev");
        Person Valentin = new Person("Valentin", 35, "male", ValentinAdress);

        Address ZakharAdress = new Address("Belarus", "Minsk");
        Person Zakhar = new Person("Zakhar", 18, "male", ZakharAdress);

        Address IvanAdress = new Address("Belarus", "Minsk");
        Person Ivan = new Person("Ivan", 19, "male", IvanAdress);

        Address MaksAdress = new Address("Belarus", "Minsk");
        Person Maks = new Person("Maks", 20, "male", MaksAdress);

        Address FedorAdress = new Address("Belarus", "Minsk");
        Person Fedor = new Person("Fedor", 21, "male", FedorAdress);

        Address EdwardAdress = new Address("Belarus", "Minsk");
        Person Edward = new Person("Edward", 23, "male", EdwardAdress);

        Address SergeyAdress = new Address("Belarus", "Minsk");
        Person Sergey = new Person("Sergey", 28, "male", SergeyAdress);

        Address PavelAdress = new Address("Belarus", "Orsha");
        Person Pavel = new Person("Pavel", 25, "male", PavelAdress);

        Address VictorAdress = new Address("Belarus", "Minsk");
        Person Victor = new Person("Victor", 26, "male", VictorAdress);

        Person[] persons = {Oleg, Alex, Igor, Vasya, Inna, Konstantin, Valentin, Zakhar, Ivan, Maks, Fedor, Edward, Sergey,
                Pavel, Victor};

        PersonRegistry personRegistry = new PersonRegistry(persons);

        System.out.println("Всего годных к службе: " + personRegistry.fitForService());
        System.out.println("Всего в проживающих в городе Минске: " + personRegistry.countPeople(new Address("Belarus", "Minsk")));
        System.out.println("Всего с именем Alex: " + personRegistry.countPeopleAlex("Alex"));
        System.out.println("Всего мужчин в озрасте от 25 до 27 лет: " + personRegistry.fitForServiceMan());
    }

}






