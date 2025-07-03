package com.principios.solid.lsp;

import com.principios.solid.lsp.birds.Chicken;

public class main {

    public static void main (String[] args) throws Exception {
        Bird bird = new Bird();
        System.out.println(bird.move());
        Bird chicken= new Chicken();
        System.out.println(chicken.move());

        bird = new Chicken();
        System.out.println(bird.move());
        chicken = new Bird();
        System.out.println(chicken.move());
    }
}
