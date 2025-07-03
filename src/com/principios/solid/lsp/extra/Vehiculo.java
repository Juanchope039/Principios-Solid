package com.principios.solid.lsp.extra;

public class Vehiculo {
    int speed = 0;

    public Vehiculo(int speed){
        this.speed = speed;
    }

    public Vehiculo() {
    }

    public void acelerate(int increment){
        speed += increment;
        System.out.println("Velocidad " + speed+ "Km/h");
    }
    public void brake(int decrement){
        speed = speed + decrement < 0 ? 0 : speed - decrement;
        System.out.println("Velocidad " + speed+ "Km/h");
    }
}

