package com.mycompany

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import org.junit.Test


@CompileStatic
@TypeChecked
class GroovyTest {
    @Test
    def void test() {
        println("GroovyTest: " + (new ExampleGroovyClass()).start())
    }
}
