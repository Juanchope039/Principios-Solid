package com.principios.solid.dip;

import com.principios.solid.dip.switchClases.Lamp;

public class main {
    public static void main(String[] args){
        Lamp lamp = new Lamp();
        lamp.operate("on");
        lamp.operate("off");
    }
}
