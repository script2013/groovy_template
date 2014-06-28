package com.mycompany

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
public class ExampleGroovyClass {
    def void hello(){
        println("Hello from groovy")
    }

    public static void main(String[] args) {
        println("----------------------------")	
        println("Running main method from groovy")
        (new ExampleJavaClass()).hello();
        println("----------------------------")
    }
}