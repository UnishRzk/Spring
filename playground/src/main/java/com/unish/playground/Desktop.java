package com.unish.playground;


import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Computer is Compiling");
    }
}
