package com.principios.solid.isp.extra;

public class main {

    public static void main(String[] args){
        testPrinters();
    }

    public static void testPrinters(){
        Printer printer = new Printer();
        ColorPrinter colorPrinter = new ColorPrinter();
        MultifunctionPrinter multifunctionPrinter = new MultifunctionPrinter();

        printer.print("doc.pdf");
        colorPrinter.printColor("doc.pdf");
        multifunctionPrinter.print("doc.pdf");
        multifunctionPrinter.printColor("doc.pdf");
        multifunctionPrinter.scan("doc.pdf");
        multifunctionPrinter.sendFax("doc.pdf");
    }
}
