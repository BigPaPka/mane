import static org.junit.Assert.*;
import  org.junit.Test;
public class StringProcessor34Test
{
    @Test
    public void testMethod3() {
        StringProcessor34 sp=new StringProcessor34();
        String res=sp.method3("Alla1Alla23");
        String expected ="AllaодинAllaдватри";
        assertEquals(expected,res);


    }
@Test
    public void testMethod4() {
       StringProcessor34 sp=new StringProcessor34();
        String res=sp.method4("I'm 23 year old! And Are are 11?");
        String expected ="Im2 erod n r r 1";
        assertEquals(expected,res);
    }
}

