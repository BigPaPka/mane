import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEquationTest {
    public static QuadraticEquation equation;

    @Test
    public void inf() {
        equation = new QuadraticEquation(0., 0., 0.);
        Double[] otv = new Double[2];
        otv[0] = Double.POSITIVE_INFINITY;
        otv[1] = Double.POSITIVE_INFINITY;
        assertArrayEquals(otv, equation.solution());
    }

    @Test
    public void korninevesh() {
        equation = new QuadraticEquation(1., 1., 10000.);
        Double[] otv = new Double[2];
        otv[0] = null;
        otv[1] = null;
        assertArrayEquals(otv, equation.solution());
    }

    @Test
    public void lin() {
        equation = new QuadraticEquation(1., 1., 0.);
        Double[] otv = new Double[2];
        otv[0] = -1.;
        otv[1] = 0.;
        assertArrayEquals(otv, equation.solution());
    }

    @Test
    public void fourSolution() {
        equation = new QuadraticEquation(3., -22., 10.);
        Double[] otv = new Double[2];
        otv[0] = 0.4868693286101813;
        otv[1] = 6.846464004723153;

        assertArrayEquals(otv, equation.solution());
    }

}