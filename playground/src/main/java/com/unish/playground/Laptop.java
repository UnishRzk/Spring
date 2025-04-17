package com.unish.playground;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Laptop is compiling");
    }

}
