public class Lin implements   OneRealArgument {
    //2.1.1
    double A, B, x;
    double right, left;

    public Lin(double a, double b, double left, double right) {
        A = a;
        B = b;
        this.left = left;
        this.right = right;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();
        return A * x + B;
    }

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public double getLeft() {
        return left;
    }
}