package com.principios.solid.isp.extra;

import com.principios.solid.isp.extra.interfaces.PrinterInterface;

public class Printer implements PrinterInterface {

    @Override
    public void print(String document) {
        System.out.printf("Imprimiendo en blanco y negro el documento %s\n", document);
    }
}
