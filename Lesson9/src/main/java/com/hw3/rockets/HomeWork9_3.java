package com.hw3.rockets;

public class HomeWork9_3 {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        IStart[] rockets = {new Shuttle(), new SpaceX(), new SpaceX123()};
        for (IStart rocket : rockets) {
            cosmodrome.startRocket(rocket);
        }
    }
}
