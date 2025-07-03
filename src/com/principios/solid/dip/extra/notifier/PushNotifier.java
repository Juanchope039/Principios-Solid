package com.principios.solid.dip.extra.notifier;

import com.principios.solid.dip.extra.abstractClases.Notifier;

public class PushNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.printf("Enviando push con texto %s\n", message);
    }
}
