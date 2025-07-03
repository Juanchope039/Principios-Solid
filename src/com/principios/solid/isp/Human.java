package com.principios.solid.isp;

import com.principios.solid.isp.interfaces.EatInterface;
import com.principios.solid.isp.interfaces.WorkInterface;

public class Human implements WorkInterface, EatInterface {

    @Override
    public void work() {
        System.out.println("Trabajando");
    }

    @Override
    public void eat() {
        System.out.println("Comiendo");
    }
}
