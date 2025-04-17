package com.unish.first;

public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello this is MyFirstClass => myVar = "+ myVar;
    }
}