package com.mycompany;

public class ExampleJavaClass {
    public String callFromGroovy(ExampleGroovyClass groovyObject, String message){
        String newMessage = "ExampleJavaClass.callFromGroovy(" + message + ")";
        return groovyObject.callFromJava(this, newMessage);
    }
}
