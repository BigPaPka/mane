import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegralTest {

    @Test
    public void testExpIntegral() {
        Exp expF = new Exp(1, 2, 1, 0);
        Integral<Exp> integral = new Integral<>(1, 2);
        assertEquals(integral.calculate(expF), 4.670754808968905,0);//e^2-e^1
    }
    @Test
    public void testExpIntegra2() {
        Exp expF = new Exp(0, 1, 0, 0);
        Integral<Exp> integral = new Integral<>(0, 1);
        assertEquals(integral.calculate(expF), 0.0,0);
    }
    @Test
    public void testExpIntegra3() {
        Exp expF = new Exp(1, 3, 1, 0);
        Integral<Exp> integral = new Integral<>(1, 3);
        assertEquals(integral.calculate(expF), 17.366965643853973,0);//e^3-e^1
    }
    @Test
    public void testLinIntegral() {
        Lin lin=new Lin(1,0,0,1);//int ot x->x^2/2
        Integral<Lin> integral = new Integral<>(0, 1);
        assertEquals(integral.calculate(lin), 0.5,0);//(1^2/2)-0
    }
}

