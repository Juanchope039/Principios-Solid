package com.principios.solid.dip.extra.notifier;

import com.principios.solid.dip.extra.abstractClases.Notifier;

public class SmsNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.printf("Enviando sms con texto %s\n", message);
    }
}
