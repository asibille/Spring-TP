package com.efrei.tp1springcomponent;

import org.springframework.stereotype.Service;

@Service("anotherService")
public class AnotherService implements ActionService {

    public void performAction() {

        System.out.println("performing action");
    }
}
