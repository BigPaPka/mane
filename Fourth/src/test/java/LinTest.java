import org.junit.Test;

import static org.junit.Assert.*;

public class LinTest {
    @Test
    public void testLinearFunction() {
        Lin linearFunction = new Lin(1, 2, 1, 10);
        assertEquals(linearFunction.getValue(2), 4,0);
    }
    @Test
    public void testLinearFunction2() {
        Lin linearFunction = new Lin(0, 0, 0, 10);
        assertEquals(linearFunction.getValue(0), 0,0);
    }
    @Test
    public void testLinearFunctionEXEPT() {
        Lin linearFunction = new Lin(0, 0, 5, 2);
        assertEquals(linearFunction.getValue(0), 0,0);
       // assertFalse(false);
    }


}



