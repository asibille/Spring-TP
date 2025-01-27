package com.efrei.tp1springcomponent;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyServiceConsumer {

    private final ActionService myService;
    private final ActionService anotherService;

    public MyServiceConsumer(
            @Qualifier("myService") ActionService myService,
            @Qualifier("anotherService") ActionService anotherService) {
        this.myService = myService;
        this.anotherService = anotherService;
    }

    public void useMyService() {
        myService.performAction();
    }

    public void useAnotherService() {
        anotherService.performAction();
    }
}
