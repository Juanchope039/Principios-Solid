package com.principios.solid.ocp.extra;

import com.principios.solid.ocp.extra.operations.*;

import java.util.HashMap;

public class Calculator {
    HashMap<String, Operation> operations;

    public Calculator(){
       operations = new HashMap();
    }

    public void addOperation(String name, Operation operation){
        operations.put(name, operation);
    }

    public double calculate(String name, double a, double b) throws Exception {
        Operation operation = operations.get(name);
        if (operation == null){
            throw new Exception("Operación '" + name + "' no está soportada");
        }
        return  operation.execute(a,b);
    }

    public static void main(String[] args) throws Exception {
        Calculator calculator= new Calculator();
        calculator.addOperation("addition", new Addition());
        calculator.addOperation("substration", new Subtration());
        calculator.addOperation("multiplication", new Multiplication());
        calculator.addOperation("division", new Division());
        calculator.addOperation("power", new Power());

        System.out.println(calculator.calculate("addition", 10,5) + "");
        System.out.println(calculator.calculate("substration", 10,5) + "");
        System.out.println(calculator.calculate("multiplication", 10,5) + "");
        System.out.println(calculator.calculate("division", 10,5) + "");
        System.out.println(calculator.calculate("power", 10,5) + "");
    }
}
