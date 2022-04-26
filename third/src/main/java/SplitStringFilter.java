
import java.util.Objects;
public class SplitStringFilter implements Filter {

    /*

    При создании объекта класса конструктор получает на вход и сохраняет строку
    pattern. Метод apply(str) проверяет, что строка паттерн содержится в нашй
     */
    private String pattern;
     ////встречается ли внутри этой строки
    public SplitStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SplitStringFilter that = (SplitStringFilter) o;
        return Objects.equals(pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "SplitStringFilter{" +
                "pattern='" + pattern + '\'' +
                '}';
    }

    @Override
    //содержит ли подстроку
    public boolean apply(String str) {
        return str.contains(pattern);
    }

    public static void main(String[] args) {
        SplitStringFilter splitStringFilter = new SplitStringFilter("tru");
        System.out.println(splitStringFilter.apply("asd"));
        System.out.println(splitStringFilter.apply("sftrusddsf"));
    }


}