package test.java;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld() {

        Person cory =new Person();
        assertEquals("HEllo WOrld", cory.helloWorld());
    }


}
