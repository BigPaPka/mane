import java.util.Objects;
public class EndingStringFilter implements Filter
{
    private String pattern;


    public EndingStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndingStringFilter that = (EndingStringFilter) o;
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
        return "BeginStringFilter{" +
                "pattern='" + pattern + '\'' +
                '}';
    }




    @Override
    public boolean apply(String str) {
        return str.endsWith(pattern);
    }




    public static void main(String[] args) {
        EndingStringFilter endStringFilter = new EndingStringFilter("an");
        System.out.println(endStringFilter.apply("Stepan"));
        System.out.println(endStringFilter.apply("Danil"));
    }


}
