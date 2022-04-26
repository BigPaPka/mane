
import java.util.Objects;
/*
Класс «Упакованный штучный товар» содержит упаковку и несколько единиц
штучного товара. Методы: получить количество штук товара, получить массу нетто
(суммарный вес всех единиц товара) и массу брутто (упаковки и всех единиц товара
вместе).
 */
public class PackagedPieceGoods implements Package {
    private int count;
    private PieceGoods pieceGoods;
    private ProductPackaging productPackaging;

    public PackagedPieceGoods(int count, PieceGoods pieceGoods, ProductPackaging productPackaging) {//k-vo
        if (count < 1 || pieceGoods == null || productPackaging == null)
            throw new NullPointerException("Constructor error");
        this.count = count;
        this.pieceGoods = pieceGoods;
        this.productPackaging = productPackaging;
    }

    public int getCount() {
        return count;
    }

    public double getBrutto() {
        return this.getNetto() + this.productPackaging.getWeight();
    }//упаковка+товар

    public double getNetto() {
        return this.count * this.pieceGoods.getWeightPerExample();
    }//вес товара(всех един)

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return pieceGoods.getName();
    }

    public PieceGoods getPieceGoods() {
        return pieceGoods;
    }

    public void setPieceGoods(PieceGoods pieceGoods) {
        this.pieceGoods = pieceGoods;
    }

    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    public void setProductPackaging(ProductPackaging productPackaging) {
        this.productPackaging = productPackaging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackagedPieceGoods that = (PackagedPieceGoods) o;
        return count == that.count && Objects.equals(pieceGoods, that.pieceGoods) && Objects.equals(productPackaging, that.productPackaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pieceGoods, productPackaging);
    }

    @Override
    public String toString() {
        return "PackagedPieceGoods{" +
                "count=" + count +
                ", pieceGoods=" + pieceGoods +
                ", productPackaging=" + productPackaging +
                '}';
    }
}
