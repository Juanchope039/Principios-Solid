package com.principios.solid.lsp.extra.vehiculos;

import com.principios.solid.lsp.extra.Vehiculo;

public class Bicycle extends Vehiculo {

    public void acelerate(int increment){
        System.out.println("La bicicleta está acelerando");
        super.acelerate(increment);
    }

    public void brake(int decrement){
        System.out.println("La bicicleta está frenando");
        super.brake(decrement);
    }
}
