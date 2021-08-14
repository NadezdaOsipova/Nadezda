package com.home.utils;

public class EndingComputation {

    //окончание на текущий уровень топлива
    public static String getEndingComputationCurrentLevel(double count) {
        double count10 = count % 10;
        double count100 = count % 100;
        String endingComputation = "";
        if (count10 >= 2) {
            endingComputation = "a";
        }
        if (count10 >= 5 || count10 == 0 || (count100 >= 11 & count100 <= 14)) {
            endingComputation = "ов";
        }
        return endingComputation;
    }


    public static String getEndingComputationCurrentLevel1(double count) {
        double count10 = count % 10;
        double count100 = count % 100;
        String endingComputation = "";
        if (count10 >= 2) {
            endingComputation = "a";
        }
        if (count10 >= 5 || count10 == 0 || (count100 >= 11 & count100 <= 14)) {
            endingComputation = "ов";
        }
        return endingComputation;
    }


    public static class getEndingComputationCurrentLevel {
        public getEndingComputationCurrentLevel(double refuelLevel) {
        }
    }
}


//    String endingComputation = "a";
//        if (count == 0) {
//                endingComputation = "ов";
//                }
