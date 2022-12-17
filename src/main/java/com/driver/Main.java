package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(100);
        System.out.println(mercedes.getName());
        System.out.println(mercedes.getCurrentDirection());
        System.out.println(mercedes.getCurrentGear());
        System.out.println(mercedes.getCurrentSpeed());
        mercedes.accelerate(-140);
        mercedes.changeSpeed(80,2);
        mercedes.stop();

    }
}