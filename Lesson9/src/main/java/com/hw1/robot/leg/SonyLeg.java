package com.hw1.robot.leg;

import com.hw1.robot.abs.RobotParts;

public class SonyLeg extends RobotParts implements ILeg {
    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println(" Нога Sony сделала шаг");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
