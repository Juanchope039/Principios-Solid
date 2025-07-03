package com.principios.solid.isp;

public class main {
    public static void main (String[] args){
        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();
    }
}
