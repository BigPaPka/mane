public class SquareTrinomialS
{


    //1.2












    public static QuadraticEquation quadraticEquation;

    public SquareTrinomialS(QuadraticEquation quadraticEquation)
    {
                                                            //  this.quadraticEquation = new QuadraticEquation(quadraticEquation.getA(),quadraticEquation.getB(),quadraticEquation.getC());
        this.quadraticEquation = new QuadraticEquation(quadraticEquation.getA(), quadraticEquation.getB(), quadraticEquation.getC());
    }

    public double returnQ() {
        Double[] mass = quadraticEquation.solution();
        if (mass[0] == null && mass[1] == null) {
            throw new ArithmeticException("Нет решений");
        }

        if(mass[1] == null) return mass[0];

        if(mass[0] == Double.POSITIVE_INFINITY || mass[1] == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Infinity");
        }

        return Math.max(mass[0], mass[1]);
    }


}
   /* public static void main(String[] args) {
        SquareTrinomialS squareTrinomialS = new SquareTrinomialS(new QuadraticEquation(1.,-10.,1.));
        System.out.println(squareTrinomialS.returnQ());
    }

    */