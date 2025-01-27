package com.efrei.tp1springcomponent;

import org.springframework.stereotype.Service;

@Service("myService")
public class MyService implements ActionService {

    public void performAction() {
        System.out.println("Myservice perform action");
    }
}