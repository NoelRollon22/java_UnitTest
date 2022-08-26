package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_sum(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(4, baseDemo.sum(2,2));
        assertEquals(10, baseDemo.sum(5,5));
    }
    @Test
    public void sum_of_negative_and_positive(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(-5, baseDemo.sum(-10,5));
        assertEquals(5, baseDemo.sum(10,-5));
    }
}
