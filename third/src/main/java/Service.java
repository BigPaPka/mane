


public class Service
    /*
    получает на вход партию товара и произвольный
фильтр из п.2. Метод возвращает количество элементов партии, имена которых
удовлетворяют фильтру.
     */
{
    public static int countByFilter(BatchOfGoods batchOfGoods, Filter filter) {
        int res = 0;
        for (Package batch : batchOfGoods.getBatch()) {
            if (filter.apply(batch.getName())) res++; //Begin
        }
        return res;
    }

    public static void main(String[] args) {
        BatchOfGoods batchOfGoods = new BatchOfGoods("Description",
                new PackedWeightGoods(new ProductPackaging("Nevhn", 50.0), new WeightProduct("Same", "Lock"), 50),
                new PackagedPieceGoods(2, new PieceGoods("Name", "Lock", 11.0), new ProductPackaging("Lame", 50.0)),
                new PackagedPieceGoods(2, new PieceGoods("Name", "Lock", 11.0), new ProductPackaging("Lame", 50.0))
        );

        BeginStringFilter beginStringFilter = new BeginStringFilter("Name");

        System.out.println(countByFilter(batchOfGoods, beginStringFilter));
    }
}
