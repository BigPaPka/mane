import org.junit.Test;

import static org.junit.Assert.*;

public class PieceGoodsTest {
    public static PieceGoods pieceGoods;

    @Test
    public void testConstructor() {
        PieceGoods product = new PieceGoods("Name", "description", 100.0);

    }

    @Test
    public void testEquals() {
        PieceGoods product1 = new PieceGoods("Name", "description", 100.0);
        PieceGoods product2 = new PieceGoods("Name", "description", 100.0);
        assertEquals(true, product1.equals(product2));

    }

    @Test
    public void testToString() {
        PieceGoods product = new PieceGoods("Name", "description", 100.0);
        assertEquals("Product{name='Name', description='description', weight='100.0'}",product.toString());

    }

    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () ->  new PieceGoods("Name", "description", -100.0));
        assertNull(thrown.getMessage());




    }




}