package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {
    @Test
    public void testSingleton(){
        Controller controller1 = Controller.getInstance();
        Controller controller2 = Controller.getInstance();
        assertEquals(controller1,controller2, "Виникла помилка.Тест на перевірку шаблону одинак невдався");
        
    }
}
