package com.principios.solid.lsp.extra.vehiculos;

import com.principios.solid.lsp.extra.Vehiculo;

public class Car extends Vehiculo {

    public void acelerate(int increment){
        System.out.println("El coche está acelerando");
        super.acelerate(increment);
    }

    public void brake(int decrement){
        System.out.println("El coche está frenando");
        super.brake(decrement);
    }
}
