import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
public class ProductPackagingTest {
    ProductPackaging product = new ProductPackaging("null", 12);
    ProductPackaging productPackaging;
    @Test
    public void toStringTest() {
        ProductPackaging product = new ProductPackaging("null", 12);
        assertEquals("ProductPackaging{name='null', weight=12.0}",product.toString());
    }

    @Test
    public void equalsTest() {
        ProductPackaging product = new ProductPackaging("null", 12);
        ProductPackaging product2 = new ProductPackaging("null", 12);
        assertEquals(true,product.equals(product2));
    }

@Test
    public void HashCodeTest()
    {
        ProductPackaging product = new ProductPackaging("null", 12);
        ProductPackaging product2 = new ProductPackaging("null", 12);
       assertEquals(product.hashCode(),product2.hashCode());
    }
   /* @Test
    public void equalsTest2() {
        ProductPackaging product = new ProductPackaging("null", 1);
        ProductPackaging product2 = new ProductPackaging("null", 12);
        assertFalse(product.equals(product2));

    }
*/

    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () -> productPackaging.setWeight(-100.));
        assertNotNull(thrown.getMessage());
         thrown = assertThrows(Exception.class, () -> productPackaging.setName(null));
        assertNotNull(thrown.getMessage());



    }

}
//  Test na ex



