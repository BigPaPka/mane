import org.junit.Test;

import static org.junit.Assert.*;

public class WeightProductTest
{
WeightProduct weightProduct;
    @Test
    public void testConstructorName() {
        WeightProduct product = new WeightProduct("name", "description");
    }

    @Test
    public void testEqualsName1() {
        WeightProduct product = new WeightProduct("name", "description");
        WeightProduct product2 = new WeightProduct("name", "description");
        assertEquals(product.equals(product2),true);
    }

@Test
    public void testToString()
{
    WeightProduct product = new WeightProduct("name", "description");
    assertEquals(product.toString(),"Product{name='name', description='description'}");
}


    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () -> weightProduct.setName(null));
        assertNotNull(thrown.getMessage());
         thrown = assertThrows(Exception.class, () -> weightProduct.setDescription(null));
        assertNotNull(thrown.getMessage());




    }





}