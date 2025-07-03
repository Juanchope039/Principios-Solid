package com.principios.solid.isp;

import com.principios.solid.isp.interfaces.WorkInterface;

public class Robot implements WorkInterface {

    @Override
    public void work() {
        System.out.println("Trabajando");
    }
}
