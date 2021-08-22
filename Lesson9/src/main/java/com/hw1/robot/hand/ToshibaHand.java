package com.hw1.robot.hand;

import com.hw1.robot.abs.RobotParts;

public class ToshibaHand extends RobotParts implements IHand {
    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Toshiba");
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
