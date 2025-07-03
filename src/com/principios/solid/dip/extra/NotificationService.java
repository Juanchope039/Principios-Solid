package com.principios.solid.dip.extra;

import com.principios.solid.dip.extra.abstractClases.Notifier;

public class NotificationService{
    Notifier notifier;

    public NotificationService(Notifier notifier){
        this.notifier = notifier;
    }

    public void notify(String menssage){
        notifier.send(menssage);
    }
}
