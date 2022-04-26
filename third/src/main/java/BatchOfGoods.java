import java.util.Arrays;
import java.util.Objects;

/*
Класс «Партия товаров». Партия товаров имеет описание и содержит некоторое
количество упакованных товаров, возможно, разных типов (в том числе наборов
товаров). Методы: конструктор по произвольному набору упаковок товаров,
получить массу всей партии (суммарная масса брутто всех товаров в партии).
 */
public class BatchOfGoods {

    private String description;
    private Package[] batch; //k-vo ypak tovarov

    public BatchOfGoods(String description, Package... batch) { //количество упакованных товаров .Функция может получить несколько Package аргументоч
        if (batch == null) throw new NullPointerException("Array error");
        this.description = description;
        this.batch = batch;
    }

    public double getBrutto() { //cуммарная масса брутто
        double sum = 0;
        for (Package сPackage : batch) {
            sum += сPackage.getBrutto();
        }
        return sum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Package[] getBatch() {
        return batch;
    }

    public void setBatch(Package[] batch) {
        if (batch == null) throw new NullPointerException();
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchOfGoods that = (BatchOfGoods) o;
        return Objects.equals(description, that.description) && Arrays.equals(batch, that.batch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "BatchOfGoods{" +
                "description='" + description + '\'' +
                ", batch=" + Arrays.toString(batch) +
                '}';
    }
}
