import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PackagedPieceGoodsTest
{

    PieceGoods product = new PieceGoods("Name", "noName", 100.00);
    PackagedPieceGoods packagedProduct = new PackagedPieceGoods(10,
            product, new ProductPackaging("Name", 10.0));


    @Test
    public void testGetCount() {
        assertEquals(packagedProduct.getCount(), 10);
    }

    @Test
    public void testGetPieceGoods() {
        assertEquals(packagedProduct.getPieceGoods(), product);
    }

    @Test
    public void testGetNetto() {
        assertEquals(packagedProduct.getNetto(), 1000.0,0);
    }

    @Test
    public void testGetBrutto() {
        assertEquals(packagedProduct.getBrutto(), 1010.0,0);
    }

    @Test
    public void testEquals() {
        PackagedPieceGoods packagedProduct = new PackagedPieceGoods(10,
                product, new ProductPackaging("Name", 10.0));
        PackagedPieceGoods packagedProduct2 = new PackagedPieceGoods(10,
                product, new ProductPackaging("Name", 10.0));
        assertEquals(true,packagedProduct.equals(packagedProduct2));
    }
    @Test
    public void testToString() {
        PackagedPieceGoods packagedProduct = new PackagedPieceGoods(10,
                product, new ProductPackaging("Name", 10.0));
        assertEquals("PackagedPieceGoods{count=10, pieceGoods=Product{name='Name', description='noName', weight='100.0'}, productPackaging=ProductPackaging{name='Name', weight=10.0}}",packagedProduct.toString());
    }




    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () ->  new PackagedPieceGoods(-1, product, new ProductPackaging("Name", 10.0)));
        assertNotNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () ->  new PackagedPieceGoods(1, null, new ProductPackaging("Name", 10.0)));
        assertNotNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () ->  new PackagedPieceGoods(11, product, new ProductPackaging(null, 10.0)));
        assertNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () ->  new PackagedPieceGoods(1, product, new ProductPackaging("Name", -10.0)));
        assertNull(thrown.getMessage());



    }



}