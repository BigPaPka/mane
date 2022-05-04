import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTrinomialSTest {
    @Test
    public void firstSolution() {
        SquareTrinomialS squareTrinomialS = new SquareTrinomialS(new QuadraticEquation(1.,-10.,1.));
        assertEquals(squareTrinomialS.returnQ(), 9.898979485566356,0);
    }

    @Test
    public void secondSolution() throws ArithmeticException {
        SquareTrinomialS squareTrinomialS = new SquareTrinomialS(new QuadraticEquation(0.,0.,1.));
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            squareTrinomialS.returnQ();
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    public void thirdSolution() {
        SquareTrinomialS squareTrinomialS = new SquareTrinomialS(new QuadraticEquation(0.,0.,0.));
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {squareTrinomialS.returnQ();});
        assertNotNull(thrown.getMessage());
    }

    @Test
    public void fourSolution() {
        SquareTrinomialS squareTrinomialS = new SquareTrinomialS(new QuadraticEquation(0.,1.,1.));
        assertEquals(squareTrinomialS.returnQ(), -1.0,0);
    }
}