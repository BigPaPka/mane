
import java.util.Objects;
/*
Класс BeginStringFilter, реализующий этот интерфейс, со следующим поведением.
 должен работать следующий фрагмент кода:
String str = “Мама мыла раму”;
BeginStringFilter filter1 = new BeginStringFilter(“Мама”);
BeginStringFilter filter2 = new BeginStringFilter(“мыла”);
boolean res1 = filter1.apply(str); // результат — true
boolean res2 = filter2.apply(str); // результат — false
 */
public class BeginStringFilter implements Filter {

    /*
    При создании объекта класса конструктор получает на вход и сохраняет строку
    pattern. Метод apply(str) проверяет, что строка str начинается с подстроки pattern.
     */
    private String pattern;


    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeginStringFilter that = (BeginStringFilter) o;
        return Objects.equals(pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    public void setPattern(String pattern)
    {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "BeginStringFilter{" +
                "pattern='" + pattern + '\'' +
                '}';
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }

    public static void main(String[] args) {
        BeginStringFilter beginStringFilter = new BeginStringFilter("trus");
        System.out.println(beginStringFilter.apply("asd"));
        System.out.println(beginStringFilter.apply("trussfddsf"));
    }


}
