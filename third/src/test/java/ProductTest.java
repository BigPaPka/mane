import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ProductTest {
Product product1;
    Product product = new Product("Name", "description");

    @Test
    public void toStringTest() {
        Product product = new Product("Name", "description");
        assertEquals("Product{name='Name', description='description'}",product.toString());
    }

    @Test
    public void equalsTest() {
        Product product = new Product("Name", "description");
        Product product2 = new Product("Name", "description");
        assertEquals(true,product.equals(product2));
    }

    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () -> product1.setName(null));
        assertNotNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> product1.setDescription(null));
        assertNotNull(thrown.getMessage());



    }



}