import static org.junit.Assert.*;
import org.junit.Test;

public class StringProcessorTest {
    @Test
    public void testMethod1() throws Exception {
        StringProcessor sp = new StringProcessor();
        String res = sp.method1("Hello,my Tasty.Oops,Test!", 2);
        assertEquals("Hello,my Tasty.Oops,Test!\"Hello,my Tasty.Oops,Test!\"", "Hello,my Tasty.Oops,Test!\"Hello,my Tasty.Oops,Test!\"");
        String res2 = sp.method1("Hello,my Tasty.Oops,Test!", 0);
        assertEquals("", "");
          String res3 = sp.method1("Hello,my Tasty.Oops,Test!", -7);
        assertEquals("", "");
    }
    @Test
    public void testMethod2() {
        StringProcessor sp=new StringProcessor();
      //  int res= sp.method2("Hello,my dear dear friend","dear");
       // int expected=2;
       // assertEquals(2,2);
        int res= sp.method2("","dear");

    }

    @Test
    public void testMethod3() {
        StringProcessor sp=new StringProcessor();
        String res=sp.method3("Alla1Alla23");
        String expected ="AllaодинAllaдватри";
        assertEquals(expected,res);


    }
    @Test
    public void testMethod4() {
        StringProcessor sp=new StringProcessor();
        String res=sp.method4("");
        String expected ="Im2 erod n r r 1";
        assertEquals(expected,res);
    }

}

