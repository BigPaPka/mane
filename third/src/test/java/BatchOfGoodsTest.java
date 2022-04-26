import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class BatchOfGoodsTest
{
    public static BatchOfGoods batchOfGoods;

    @BeforeAll
    public static void Constr() {
        batchOfGoods = new BatchOfGoods("Description",
                new PackedWeightGoods(new ProductPackaging("Name1", 10.0), new WeightProduct("Name3", "Lock"), 10),
                new PackagedPieceGoods(10, new PieceGoods("Name2", "Lock", 1.0), new ProductPackaging("Name4", 10.0))
        );
    }

    @Test
    public void TestBatch() {
        assertEquals(batchOfGoods.getBrutto(), 40.0, 0);
    }
    @Test
    public void TestEquals() {
        BatchOfGoods p = new BatchOfGoods("Description",
                new PackedWeightGoods(new ProductPackaging("Name1", 10.0), new WeightProduct("Name3", "Lock"), 10),
                new PackagedPieceGoods(10, new PieceGoods("Name2", "Lock", 1.0), new ProductPackaging("Name4", 10.0))

        );
        BatchOfGoods p2 = new BatchOfGoods("NoDescription",
                new PackedWeightGoods(new ProductPackaging("Name1", 10.0), new WeightProduct("Name3", "Lock"), 10),
                new PackagedPieceGoods(10, new PieceGoods("Name2", "Lock", 1.0), new ProductPackaging("Name4", 10.0))
        );
        assertEquals(false,p.equals(p2));
    }



    @Test
    public void TestToString() {
        BatchOfGoods p = new BatchOfGoods("Description",
                new PackedWeightGoods(new ProductPackaging("Name1", 10.0), new WeightProduct("Name3", "Lock"), 10)
        );

        assertEquals(p.toString(),"BatchOfGoods{description='Description', batch=[PackedWeightGoods{productPackaging=ProductPackaging{name='Name1', weight=10.0}, weightProduct=Product{name='Name3', description='Lock'}, weight=10.0}]}");
    }






    @Test
    public void batchException() throws Exception {
        Throwable thrown = assertThrows(Exception.class, () -> batchOfGoods.setBatch(null));
        assertNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> {
            new PackedWeightGoods(new ProductPackaging("Name1", 10.0), new WeightProduct("Name", "Lock"), -10);
        });
        assertNotNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> {
            new PackedWeightGoods(new ProductPackaging("Name1", 10.0), null, 10);
        });
        assertNotNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> {
            new PackedWeightGoods(null, new WeightProduct("Name1", "Lock"), 10);
        });
        assertNotNull(thrown.getMessage());
    }
}