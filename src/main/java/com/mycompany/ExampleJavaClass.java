package com.mycompany;

public class ExampleJavaClass {
    public void hello(){
        System.out.println("Hello from java");
        //need to have sourceSets enabled in the gradle.build
        (new ExampleGroovyClass()).hello();
    }
}
