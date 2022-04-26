import java.util.Objects;

/*
«Упакованный весовой товар»
Cодержит упаковку и некоторое количество
весового товара (в кг). Методы: конструктор по товару, массе товара и упаковке,
получить массу нетто (только товара) и массу брутто (упаковки и товара вместе).
 */
public class PackedWeightGoods implements Package { //класс PackedWeightGoods реализует интерфейс Package
    private ProductPackaging productPackaging;
    private WeightProduct weightProduct;
    private double weight;

    public PackedWeightGoods(ProductPackaging productPackaging, WeightProduct weightProduct, double weight) {
        if (weight <= 0 || productPackaging == null || weightProduct == null)
            throw new NullPointerException("error");
        this.productPackaging = productPackaging;
        this.weightProduct = weightProduct;
        this.weight = weight;
    }

    public double getNetto() {
        return this.weight;
    }//товар

    public double getBrutto() {
        return this.getNetto() + this.productPackaging.getWeight();
    }//упаковка+товар

    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    public String getName() {
        return weightProduct.getName();
    }

    public void setProductPackaging(ProductPackaging productPackaging) {
        this.productPackaging = productPackaging;
    }

    public WeightProduct getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(WeightProduct weightProduct) {
        this.weightProduct = weightProduct;
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
        PackedWeightGoods that = (PackedWeightGoods) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(productPackaging, that.productPackaging) && Objects.equals(weightProduct, that.weightProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productPackaging, weightProduct, weight);
    }

    @Override
    public String toString() {
        return "PackedWeightGoods{" +
                "productPackaging=" + productPackaging +
                ", weightProduct=" + weightProduct +
                ", weight=" + weight +
                '}';
    }
}
