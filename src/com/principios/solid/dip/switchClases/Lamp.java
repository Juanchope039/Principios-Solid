package com.principios.solid.dip.switchClases;

import com.principios.solid.dip.abstractClases.SwitchAbstract;

public class Lamp{
    SwitchAbstract switchAbstract = new LampSwitch();

    public void operate(String command){
        if (command.equals("on"))
            switchAbstract.turnOn();
        else if (command.equals("off"))
            switchAbstract.turnOff();
    }
}
