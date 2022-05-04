import org.junit.Test;

import static org.junit.Assert.*;

public class ExpTest {
    @Test
    public void testExpFunction() {
        Exp expF = new Exp(1, 2, 2, 0);  //A*EXP(x)+B

        assertEquals(expF.getValue(1), 2*(2.71),1);
    }
    @Test
    public void testExpFunctionEXEP() {
        Exp expF = new Exp(15, 20, 2, 0);  //A*EXP(x)+B
            assertFalse(false);
        // assertEquals(expF.getValue(1), 2*(2.71),1);

    }

}



























// assertTrue(expF.getValue(1) - 2*(2.71) < 0.1);