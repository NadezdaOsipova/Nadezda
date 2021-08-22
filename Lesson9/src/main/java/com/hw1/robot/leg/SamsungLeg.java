package com.hw1.robot.leg;

import com.hw1.robot.abs.RobotParts;

public class SamsungLeg extends RobotParts implements ILeg {
    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println(" Нога Samsung сделала шаг");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
