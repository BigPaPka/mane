import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class Sum4Test {
    @Test
    public void testSumFunctional() {
        Sin sin = new Sin(0, 1, 1, 1);
        Sum4<Sin> sum = new Sum4<>(0, 0.5);

        assertEquals(sum.calculate(sin), 1.682,1);
    }
    @Test
    public void testSumFunctional2() {
        Sin sin = new Sin(0, 1, 2, 1);
        Sum4<Sin> sum = new Sum4<>(0, 0.5);

        assertEquals(sum.calculate(sin), 3.365883939231586,1);
    }
}

//указывает на более старую версию slf4j.(
/*
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>${slf4j.version}</version>
</dependency>
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>${slf4j.version}</version>
</dependency>
 */
//https://www.slf4j.org/manual.html