package com.unish.first;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service

public class MyFirstService {

    private final MyFirstClass myFirstClass;

    public MyFirstService(MyFirstClass myFirstClass) {

        this.myFirstClass = myFirstClass;
    }


    public String saySomething(){

        return "the dependency is saying: "+myFirstClass.sayHello();
    }
}
