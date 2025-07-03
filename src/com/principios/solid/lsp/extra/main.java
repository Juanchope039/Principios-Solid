package com.principios.solid.lsp.extra;

import com.principios.solid.lsp.extra.vehiculos.*;

public class main {

    public static void main(String[] args){
        Vehiculo car = new Car(),
                bicycle = new Bicycle(),
                motorcycle = new Motorcycle();

        testVehicle(car);
        testVehicle(bicycle);
        testVehicle(motorcycle);

    }

    public static void testVehicle(Vehiculo vehicle){
        vehicle.acelerate(2);
        vehicle.brake(1);
    }
}
