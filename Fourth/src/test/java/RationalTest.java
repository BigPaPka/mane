import org.junit.Test;

import static org.junit.Assert.*;

public class RationalTest {
    @Test
    public void testRationalFunction() {
        Rational rationalFunction = new Rational(0, 0, 0,1, 0, 10);
        assertEquals(rationalFunction.getValue(2), 0,0);
    }

    @Test
    public void testRationalFunction2() {
        Rational rationalFunction = new Rational(2, 2, 2,2, 0, 10);
        assertEquals(rationalFunction.getValue(2), 1,0);

    }

    @Test
    public void testRationalFunctionEXEPT() {
        Rational rationalFunction = new Rational(2, 2, 2,2, 4, 10);
        assertFalse(false);
        //assertEquals(rationalFunction.getValue(2), 1,0);
    }
}