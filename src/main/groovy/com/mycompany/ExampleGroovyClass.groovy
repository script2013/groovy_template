package com.mycompany

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
public class ExampleGroovyClass {
    ExampleJavaClass javaObject = new ExampleJavaClass();

    public def String start(){
        return javaObject.callFromGroovy(this, "Hello from Groovy")
    }

    public def String callFromJava(ExampleJavaClass javaClass, String msg){
        return "ExampleGroovyClass.callFromJava(" + msg + ")"
    }

    public static void main(String[] args) {
        println("----------------------------")	
        println("Running main method from groovy")
        println((new ExampleGroovyClass()).start())
        println("----------------------------")
    }
}