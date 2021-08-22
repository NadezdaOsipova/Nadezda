package com.hw1.robot.robot;

import com.hw1.robot.hand.IHand;
import com.hw1.robot.hand.SamsungHand;
import com.hw1.robot.hand.SonyHand;
import com.hw1.robot.hand.ToshibaHand;
import com.hw1.robot.head.IHead;
import com.hw1.robot.head.SamsungHead;
import com.hw1.robot.head.SonyHead;
import com.hw1.robot.head.ToshibaHead;
import com.hw1.robot.leg.ILeg;
import com.hw1.robot.leg.SamsungLeg;
import com.hw1.robot.leg.SonyLeg;
import com.hw1.robot.leg.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IHead[] heads = new IHead[3];
        heads[0] = new SamsungHead(5000);
        heads[1] = new SonyHead(4500);
        heads[2] = new ToshibaHead(8000);

        IHand[] hands = new IHand[3];
        hands[0] = new SamsungHand(9000);
        hands[1] = new ToshibaHand(5000);
        hands[2] = new SonyHand(7990);

        ILeg[] legs = new ILeg[3];
        legs[0] = new ToshibaLeg(5500);
        legs[1] = new SamsungLeg(7800);
        legs[2] = new SonyLeg(5500);

        IRobot[] robots = new Robot[3];
        int maxPrice = Integer.MIN_VALUE;
        int maxPriceIndex = -1;
        List<Robot> robotList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Robot robot = new Robot(heads[i], hands[i],legs[i]);
            robots[i] =robot;
            robotList.add(robot);
            robots[i].action();
            System.out.println();

            int price = robots[i].getPrice();
            if (price > maxPrice) {
                maxPriceIndex = i;
                maxPrice =price;
            }
        }
        Robot maxPriceRobot = (Robot) robots[maxPriceIndex];
        System.out.printf("Самый дорогой робот стоит %d y.e и состоит из головы %s, рук %s и ног %s \n ", maxPrice, maxPriceRobot.getHead().getClass().getSimpleName(),
                maxPriceRobot.getHand().getClass().getSimpleName(), maxPriceRobot.getLeg().getClass().getSimpleName());

    }
}
