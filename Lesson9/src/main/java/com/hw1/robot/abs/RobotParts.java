package com.hw1.robot.abs;

public abstract class RobotParts {
    protected final int price;

    public int getPrice() {
        return price;
    }

    protected RobotParts(int price) {
        this.price = price;
    }
}
