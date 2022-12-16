import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void sum() throws Exception{
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected,actual);
    }
}