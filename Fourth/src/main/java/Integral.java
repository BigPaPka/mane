public class Integral<T extends OneRealArgument> implements FunctOfOneArgument<T> {
   //2.4.2
    private final double right, left;

    public Integral(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T func) throws IllegalArgumentException {
        if (left < func.getLeft() || right > func.getRight()) throw new IllegalArgumentException();
        int n = 100;
        double result = 0.0;

        double h = Math.abs(right - left) / n; //шаг разбиения (длина каждого промежуточного отрезка)
        for (int i = 0; i < n; i++) {
            result += func.getValue(left + i * h + h / 2) * h;
        }
        return result;
    }
}
