package com.hw1.robot.head;

import com.hw1.robot.abs.RobotParts;

public class SamsungHead extends RobotParts implements IHead {
    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
