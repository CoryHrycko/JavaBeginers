package com.marcusbiel.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest{

    @Test 
    public void shouldReturnHelloWorld(){
        // comment? Awesome references person
        Person marcus = new Person();
        // asserting that the helloworld function is returning in the cory variable
        assertEquals("Hello World", marcus.helloWorld() );
    }
}