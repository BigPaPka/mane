import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinanceReportTest {
    FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
            new Payment("Katya", 2002, 2, 16, 1043),
            new Payment("Danil", 2021, 1, 11, 1122.2));


    @Test
    public void toStringTest() {
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Danil", 2021, 1, 11, 1122.2));
        assertEquals("[Имя: JK, Дата: 19.2.2003, Платежи: [Плательщик:  Katya, Дата:  16.2.2002, Сумма:  1043.0, Плательщик:  Danil, Дата:  11.1.2021, Сумма:  1122.2]\n" +
                "]", financeReport.toString());


    }

    @Test
    public void equalsTest() {
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Danil", 2021, 1, 11, 1122.2));
        FinanceReport financeReport2 = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Danil", 2021, 1, 11, 1122.2));
        assertEquals(true, financeReport.equals(financeReport2));

    }

    @Test
    public void testCopy() {
        FinanceReport financeReportcopy = financeReport.copy();
        FinanceReport financeReportcopy1 = financeReport.copy();
        financeReportcopy.setPayment(1, new Payment("sdfsf", 2777, 7, 7, 77.2));
        assertEquals(financeReport, financeReportcopy1);


    }

    @Test
    public void testGetCount() {
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Danil", 2021, 1, 11, 1122.2));
        assertEquals(2, financeReport.getCount());

    }

  /*  @Test
    public void testCopy1() {
        FinanceReport copy = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Danil", 2021, 1, 11, 1122.2));
        copy.setPayment(0, new Payment("sdfsf", 2777, 7, 7, 77.2));
        assertNotEquals(copy.getPayment(0), financeReport.getPayment(0));
    }

   */


    @Test
    public void GetPaymentTest() {
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043));
        assertEquals(new Payment("Katya",2002,2,16,1043), financeReport.getPayment(0));


    }
    @Test
    public void SetPaymentTest() {
        Payment payment = null;
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Katya", 2002, 2, 16, 1043));
        FinanceReport financeReport2 = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya1", 2002, 2, 16, 1043),
                new Payment("Katya", 2002, 2, 16, 1043));
        financeReport.setPayment(0, new Payment("Katya1", 2002, 2, 16, 1043));
        assertEquals( financeReport,financeReport2);


    }


    @Test
    public void testCopy1() {
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Katya", 2002, 2, 16, 1043));
        FinanceReport copy = new FinanceReport(financeReport);
        copy.setPayment(0, new Payment("Katya", 2002, 2, 16, 1043));
        assertEquals(copy.getPayment(0), financeReport.getPayment(0));
    }


}

//konstcop test






