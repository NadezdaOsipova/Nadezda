package com.hw1.robot.head;

import com.hw1.robot.abs.RobotParts;

public class SonyHead extends RobotParts implements IHead {
    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
