//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
//        System.out.println(mercedes.getCurrentGear());
//        mercedes.stop();
    }
}
