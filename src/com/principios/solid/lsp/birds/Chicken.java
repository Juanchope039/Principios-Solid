package com.principios.solid.lsp.birds;

import com.principios.solid.lsp.Bird;

public class Chicken extends Bird {
    @Override
    public String move() {
        return "walking";
    }
}
