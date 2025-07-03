package com.principios.solid.dip.extra.notifier;

import com.principios.solid.dip.extra.abstractClases.Notifier;

public class EmailNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.printf("Enviando email con texto %s\n", message);
    }
}
