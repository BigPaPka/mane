import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class PackedWeightGoodsTest
{


    PackedWeightGoods product = new PackedWeightGoods(new ProductPackaging("ddd",100),new WeightProduct("Name","noName"),100.0);



        @Test
        public void testGetNetto() {
           assertEquals(100.0, product.getNetto(),0);
        }

        @Test
        public void testGetGBrutto() {
            assertEquals(product.getBrutto(), 200.0,0);//getNetto() + getWeight()
        }


    @Test
    public void testEquals() {
        PackedWeightGoods product = new PackedWeightGoods(new ProductPackaging("ddd",100),new WeightProduct("Name","noName"),100.0);
        PackedWeightGoods product2 = new PackedWeightGoods(new ProductPackaging("ddd",100),new WeightProduct("Name","noName"),100.0);
assertEquals(true,product.equals(product2));
    }
    @Test
    public void testToString() {
        PackedWeightGoods product = new PackedWeightGoods(new ProductPackaging("ddd",100),new WeightProduct("Name","noName"),100.0);
        assertEquals("PackedWeightGoods{productPackaging=ProductPackaging{name='ddd', weight=100.0}, weightProduct=Product{name='Name', description='noName'}, weight=100.0}",product.toString());
    }


    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () -> new PackedWeightGoods(new ProductPackaging("ddd",100),new WeightProduct("Name","noName"),-100.0));
        assertNotNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> new PackedWeightGoods(new ProductPackaging("ddd",-100),new WeightProduct("Name","noName"),100.0));
        assertNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> new PackedWeightGoods(new ProductPackaging(null,-1),new WeightProduct("Name","noName"),100.0));
        assertNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> new PackedWeightGoods(new ProductPackaging(" ",1),new WeightProduct(null,"noName"),100.0));
        assertNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> new PackedWeightGoods(new ProductPackaging(" ",1),new WeightProduct(null,null),100.0));
        assertNull(thrown.getMessage());


    }
    }



