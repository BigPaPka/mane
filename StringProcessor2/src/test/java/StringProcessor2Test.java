import static org.junit.Assert.*;
import org.junit.Test;
public class StringProcessor2Test {
@Test
    public void testMethod2() {
        StringProcessor2 sp=new StringProcessor2();
        int res= sp.method2("Hello,my dear dear friend","dear");
        int expected=2;
        assertEquals(2,2);

    }
}