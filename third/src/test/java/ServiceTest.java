import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ServiceTest
{
    BatchOfGoods batchOfGoods = new BatchOfGoods("Description",
            new PackedWeightGoods(new ProductPackaging("Name", 50.0), new WeightProduct("Name", "Lock"), 50),
            new PackagedPieceGoods(2, new PieceGoods("Name", "Lock", 1.0), new ProductPackaging("Name", 50.0))
    );
    

    @Test
    public void testServiceTrue() {
        BeginStringFilter beginStringFilter = new BeginStringFilter("Name");
        assertEquals(Service.countByFilter(batchOfGoods, beginStringFilter),2);
    }
    @Test
    public void testServiceFalse() {
        BeginStringFilter beginStringFilter = new BeginStringFilter("Pain");
        assertEquals(Service.countByFilter(batchOfGoods, beginStringFilter),0);
    }


}