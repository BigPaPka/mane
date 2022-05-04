import java.util.Arrays;
import java.util.Objects;
public class QuadraticEquation {
    //1.1 klss
    private Double a;
    private Double b;
    private Double c;

    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double[] solution() {
        Double[] result = new Double[2];

        if (a != 0) {
            double D = b * b - 4 * a * c;

            if (D > 0) {
                result[0] = (-b - Math.sqrt(D)) / (2 * a);
                result[1] = (-b + Math.sqrt(D)) / (2 * a);
            }
            else if (D == 0) {
                result[0] = -b / (2 * a);
            }
        }
        else if (b != 0)
        {
            result[0] = -c / b;
        }
        else {                                               //D<0
            if (c == 0) {
                result[0] = Double.POSITIVE_INFINITY;
                result[1] = Double.POSITIVE_INFINITY;
            }
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuadraticEquation that = (QuadraticEquation) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

      public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1., 1., 1000.);

        System.out.println(Arrays.toString(quadraticEquation.solution()));
    }


}
//заключает значение примитивного типа doubleв объект
/*
 <dependency>
            <groupId>ru.imit.omsu</groupId>
            <artifactId>Fourth</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
 */



