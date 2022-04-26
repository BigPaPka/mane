import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {
    public static FinanceReport financeReport;

    @BeforeAll
    public static void Constr() {
        financeReport = new FinanceReport("Stepan", 2002, 9, 24,
                new Payment("fsfds", 2020, 12, 9, 1.2),
                new Payment("",2020,12,1,1.1));


    }

@Test
public  void TestGetPaymentString()
{
    FinanceReport financeReport = new FinanceReport("Stepan", 2003, 2, 19,
            new Payment("Sasha", 2020, 1, 19, 1123.2),
            new Payment("Mj", 2020, 1, 1, 11.1));

assertEquals(Arrays.toString(FinanceReportProcessor.getPaymentString(financeReport, "S")),"[Плательщик:  Sasha, Дата:  19.1.2020, Сумма:  1123.2]");

}


    @Test
    public  void TestGetPayment()
    {
        FinanceReport financeReport = new FinanceReport("Stepan", 2003, 2, 19,
                new Payment("Sasha", 2020, 1, 19, 1123.2),
                new Payment("Mj", 2020, 1, 1, 11.1));

        assertEquals(Arrays.toString(FinanceReportProcessor.getPayment(financeReport, 100)),"[Плательщик:  Mj, Дата:  1.1.2020, Сумма:  11.1]");

    }



    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () -> financeReport.setPayment(0, new Payment("Stepan", -2020, 2, 1, 20.20)));
        assertNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> financeReport.setPayment(0, new Payment("Stepan", 2020, -2, 1, 20.20)));
        assertNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> financeReport.setPayment(0, new Payment("Stepan", 2020, 19, 5, 20.20)));
        assertNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> financeReport.setPayment(0, new Payment("Stepan", 2020, 19, 56, 20.20)));
        assertNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> financeReport.setPayment(0, new Payment("Stepan", 2020, 2, -5, 20.20)));
        assertNull(thrown.getMessage());


    }
    @Test
    public void checkLength() {
        int length = financeReport.getCount();
        assertEquals(length, 2);
    }


}