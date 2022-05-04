import org.junit.Test;

import static org.junit.Assert.*;

public class SinTest {
    @Test
    public void testSinFunction() {
        Sin sin = new Sin(0, 1, 1, 0);
        assertEquals(sin.getValue(0), 0,0);
    }
    @Test
    public void testSinFunction2() {
        Sin sin = new Sin(0, 1, 1, 1);
        assertEquals(sin.getValue(1), 0.8414709848078965 ,0);
    }
    @Test
    public void testSinFunctionEXEP() {
        Sin sin = new Sin(0, 1, 5, 10);
        assertFalse(false);

    }
}