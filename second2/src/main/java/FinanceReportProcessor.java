
import java.util.ArrayList;
import java.util.Arrays;
/*
1) получение платежей всех людей, чья фамилия начинается на указанный символ
(символ — входной параметр),
2) получение всех платежей, размер которых меньше заданной величины.
 */
public class FinanceReportProcessor
{
    public static Payment[] getPaymentString(FinanceReport financeReport, String begin) { //получение платежей всех людей, чья фамилия начинается на указанный символ
        ArrayList<Payment> arrayList = new ArrayList<>();//не указываем размер ArrayList’a, поскольку он является автоматически расширяем
        for (int i = 0; i < financeReport.getCount(); i++) {
            if (financeReport.getPayment(i).getName().startsWith(begin))
                arrayList.add(financeReport.getPayment(i));
        }

        Payment[] payments = new Payment[arrayList.size()];//ch indx
        int index = 0;
        for (Payment payment : arrayList) {
            payments[index] = payment;
            index++;
        }

        return payments;
    }
//получение всех платежей, размер которых меньше заданной величины.
    public static Payment[] getPayment(FinanceReport financeReport, double sumMax) {
        ArrayList<Payment> arrayList = new ArrayList<>();
        for (int i = 0; i < financeReport.getCount(); i++) {
            if (financeReport.getPayment(i).getSum() < sumMax)
                arrayList.add(financeReport.getPayment(i));
        }

        Payment[] payments = new Payment[arrayList.size()];
        int index = 0;
        for (Payment payment : arrayList) {
            payments[index] = payment;
            index++;
        }

        return payments;
    }

    public static void main(String[] args) {
        FinanceReport financeReport = new FinanceReport("Stepan", 2003, 2, 19,
                new Payment("Sasha", 2020, 1, 19, 1123.2),
                new Payment("Mj", 2020, 1, 1, 11.1));


System.out.print(financeReport);
        System.out.println(Arrays.toString(getPaymentString(financeReport, "S")));
       System.out.println(Arrays.toString(getPayment(financeReport, 100)));
    }

}
