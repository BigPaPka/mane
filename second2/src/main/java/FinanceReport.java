import java.util.Arrays;
import java.util.Objects;

/*
Создайте класс FinanceReport, содержащий массив платежей, ФИО составителя
отчета, дату создания отчета.
 */


public class FinanceReport {

    private Payment[] arr;
    private String name;
    private int year;
    private int month;
    private int day;

    public FinanceReport(String name, int year, int month, int day, Payment... arr) { //функция может получить несколько Payment аргументы
        if (year < 2000) throw new ArithmeticException("...");
        if (month > 12 || month < 1) throw new ArithmeticException();
        if (day < 1 || day > 31) throw new ArithmeticException();

        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.arr = arr;
    }

    public FinanceReport(FinanceReport financeReport) {
        this.year = financeReport.getYear();
        this.month = financeReport.getMonth();
        this.day = financeReport.getDay();
        this.name = financeReport.getName();
        this.arr = financeReport.getArr();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2000) throw new ArithmeticException();
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12 || month < 1) throw new ArithmeticException();
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) throw new ArithmeticException();
        this.day = day;
    }


    public Payment[] getArr() {
        return arr;
    }

    private void checkIndex(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (this.arr == null || this.arr.length <= index) throw new IndexOutOfBoundsException();
    }





    public int getCount() {
        return arr.length;
    }//получение количества платежей

    public Payment getPayment(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void setPayment(int index, Payment payment) {
        checkIndex(index);
        arr[index] = payment;
    }

    @Override
    public String toString() {//преобразует отчет в набор строк формата :

        return "[Имя: " + name + ", Дата: " + day + "." + month + "." + year + ", Платежи: " + Arrays.toString(arr) + "\n]";
    }
    //конструктор копирования
    private Payment[] arrayCopy(Payment[] arr) {
        if (arr == null) return null;

        Payment[] arrayNew = new Payment[arr.length];
/*
Копирование элементов массива
Первым параметром является массив-источник.
Вторым параметром является позиция начала нового массива.
Третий параметр — массив-назначения.
5 параметр является начальным положением целевого массива(это количество элементов, которые будут скопированы)
 */
        System.arraycopy(this.arr, 0, arrayNew, 0, arrayNew.length);

        return arrayNew;
    }

    public FinanceReport copy() {
        return new FinanceReport(this.name, this.year, this.month, this.day, arrayCopy(this.arr));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return year == that.year && month == that.month && day == that.day && Arrays.equals(arr, that.arr) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, month, day);
    }

    public static void main(String[] args) {
        FinanceReport financeReport = new FinanceReport("JK", 2003, 2, 19,
                new Payment("Katya", 2002, 2, 16, 1043),
                new Payment("Danil", 2021, 1, 11, 1122.2));

       // FinanceReport financeReportcopy = financeReport.copy();
      //  financeReportcopy.setPayment(1, new Payment("sdfsf", 2777, 7, 7, 77.2));



        System.out.println(financeReport);
        System.out.println(financeReport.getPayment(0));
        System.out.println(  financeReport.toString());
        System.out.println ( financeReport.getCount());
        System.out.println(financeReport.getPayment(1));
      //  System.out.println(financeReportcopy);
    }
}

//  return String.format("[Имя: " + %s + ", Дата: " + %s + "." + %s + "." + %s + ", Платежи: " + %n%s + "\n],name,day,month,years,);