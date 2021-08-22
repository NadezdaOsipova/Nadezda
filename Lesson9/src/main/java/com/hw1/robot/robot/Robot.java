package com.hw1.robot.robot;

import com.hw1.robot.abs.RobotParts;
import com.hw1.robot.hand.IHand;
import com.hw1.robot.head.IHead;
import com.hw1.robot.leg.ILeg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = ((RobotParts) head).getPrice() + ((RobotParts) hand).getPrice() + ((RobotParts) leg).getPrice();
        return price;
    }
}
