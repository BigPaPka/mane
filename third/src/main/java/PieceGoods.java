import java.util.Objects;
//«Штучный товар».хранит название, описание и вес одной
//штуки товара (в кг).
public class PieceGoods extends Product{


    private double weightPerExample;//v odn ht

    public PieceGoods(String name, String description, double weightPerExample) {
        super(name, description);
        if (Double.compare(weightPerExample, 0.0) == -1) throw new IllegalArgumentException();
        this.weightPerExample = weightPerExample;
    }

    public double getWeightPerExample() {
        return weightPerExample;
    }

    public void setWeightPerExample(double weightPerExample) {
        this.weightPerExample = weightPerExample;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceGoods product = (PieceGoods) o;
        return Objects.equals(this.getName(), product.getName()) && Objects.equals(this.getDescription(), product.getDescription()) && Objects.equals(this.getWeightPerExample(), product.getWeightPerExample());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getDescription(), this.getWeightPerExample());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.getName() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", weight='" + this.getWeightPerExample() + '\'' +
                '}';
    }
}
