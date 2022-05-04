public class Sum4 <T extends OneRealArgument> implements FunctOfOneArgument<T> {
    //2.4.1
    private final double right, left;

    public Sum4(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T func) {       //умма на концах и сер.
        if (left < func.getLeft() || right > func.getRight()) throw new IllegalArgumentException();
        return func.getValue(func.getRight()) +
                func.getValue(func.getLeft()) +
                func.getValue((func.getRight() + func.getRight()) / 2);
    }
}
