import java.util.Objects;

//Класс «Упаковка товара».
//Упаковка имеет название и массу
public class ProductPackaging {
    private String name;
    private double weight;

    public ProductPackaging(String name, double weight) {
        if (weight < 0) throw new ArithmeticException();
        if (name == null) throw new IllegalArgumentException();
        this.name = name;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackaging that = (ProductPackaging) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "ProductPackaging{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }



}


//namespace
//toString,hashCode,equals
/*
public class Main
{
    public static void main(String[] args) {
        BatchOfGoods batchOfGoods = new BatchOfGoods("Description",
                new PackedWeightGoods(new ProductPackaging("Naneobl", 10.0), new WeightProduct("Name1", "Lock"), 10),
                new PackagedPieceGoods(5, new PieceGoods("Name2", "Lock", 1.0), new ProductPackaging("Name3", 10.0))
        );

        System.out.println(batchOfGoods);
        System.out.println(batchOfGoods.getBrutto());

    }


}
 */