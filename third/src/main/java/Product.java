import java.util.Objects;



//Класс «Товар». Товар имеет название и описание (строки).
public class Product {



    private String name;
    private String description;



    public Product(String name, String description) {
        this.name = name;
        this.description = description;
        if (name == null || description == null) throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    public int hashCode() {
        return Objects.hash(name, description);
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
