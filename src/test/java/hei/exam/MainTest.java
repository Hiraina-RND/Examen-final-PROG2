package hei.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void mainTest(){
        String result = Main.sayHello();
        assertEquals("Hello World!",result);
    }
}
