package com.principios.solid.isp.extra;

import com.principios.solid.isp.extra.interfaces.ColorPrinterInterface;

public class ColorPrinter implements ColorPrinterInterface {

    @Override
    public void printColor(String document) {
        System.out.printf("Imprimiendo a color el documento %s \n", document);
    }
}
