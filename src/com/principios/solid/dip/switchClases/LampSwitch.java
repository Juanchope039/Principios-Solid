package com.principios.solid.dip.switchClases;

import com.principios.solid.dip.abstractClases.SwitchAbstract;

public class LampSwitch extends SwitchAbstract {

    @Override
    public void turnOn() {
        System.out.println("Encender lampara");
    }

    @Override
    public void turnOff() {
        System.out.println("Apagar lampara");
    }
}

