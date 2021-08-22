package com.hw1.robot.hand;

import com.hw1.robot.abs.RobotParts;

public class SamsungHand extends RobotParts implements IHand {
    public SamsungHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Samsung");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
