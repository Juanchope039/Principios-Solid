package com.principios.solid.isp.extra;

import com.principios.solid.isp.extra.interfaces.ColorPrinterInterface;
import com.principios.solid.isp.extra.interfaces.FaxInterface;
import com.principios.solid.isp.extra.interfaces.PrinterInterface;
import com.principios.solid.isp.extra.interfaces.ScannerInterface;

public class MultifunctionPrinter implements PrinterInterface, ColorPrinterInterface, ScannerInterface, FaxInterface {

    @Override
    public void print(String document) {
        System.out.printf("Imprimiendo en blanco y negro el documento %s\n", document);
    }

    @Override
    public void printColor(String document) {
        System.out.printf("Imprimiendo a color el documento %s\n", document);
    }

    @Override
    public void sendFax(String document) {
        System.out.printf("Enviando por Fax el documento %s\n", document);
    }

    @Override
    public String scan(String document) {
        System.out.printf("Escaneando el documento %s\n", document);
        return "Documento " + document + " escaneado";
    }
}
