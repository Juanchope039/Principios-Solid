package com.principios.solid.ocp.extra.operations;

import com.principios.solid.ocp.extra.Operation;

public class Division extends Operation {
    @Override
    public double execute(double a, double b) {
        return a / b;
    }
}
