package com.principios.solid.dip.extra;

import com.principios.solid.dip.extra.notifier.EmailNotifier;

public class main {
    public static void main(String[] main){
        NotificationService service = new NotificationService(new EmailNotifier());
        service.notify("¡Hola, notificador!");
    }
}

