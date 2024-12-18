package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.assertEquals;

public class ViewTest {
    View view = new View();

    @Test
    public void testInputAnswerTrue(){
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(5, view.InputAnswer(1,7));
        System.setIn(System.in);
    }

    @Test
    public void testInputAnswerFalse(){
        String input = "k\n 9\n 2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(2, view.InputAnswer(1,7));
        System.setIn(System.in);
    }
}
