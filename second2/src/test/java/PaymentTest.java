import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class PaymentTest {
    Payment payment1;
 Payment payment=new Payment("Katya", 2002, 2, 16, 1043) ;


    @Test
    public void toStringTest() {
        Payment payment = new Payment("Katya", 2002, 2, 16, 1043);
        assertEquals("Плательщик:  Katya, Дата:  16.2.2002, Сумма:  1043.0", payment.toString());
    }

    @Test
    public void equalsTest() {
        Payment payment1 = new Payment("Katya", 2002, 2, 16, 1043);
        Payment payment2 = new Payment("Katya", 2002, 2, 16, 1043);
        Payment payment3 = new Payment("Stepan", 2002, 2, 16, 1043);
        assertEquals(true, payment1.equals(payment2));
        assertEquals(false, payment1.equals(payment3));

    }

    @Test
    public void GetTest() {
        Payment payment = new Payment("Katya", 2002, 2, 16, 1043);
        assertEquals("Katya", payment.getName());
        assertEquals(16, payment.getDay());
        assertEquals(2, payment.getMonth());
        assertEquals(2002, payment.getYear());
        assertEquals(1043, payment.getSum(),0);

    }






    @Test
    public void checkException() throws Exception { //Записываются только неудачные утверждения
        //Ожидаемое исключение
        Throwable thrown = assertThrows(Exception.class, () -> new Payment("name", -42,2,1,1));
        assertNull(thrown.getMessage());

        thrown = assertThrows(Exception.class, () -> new Payment("name", 42,-2,1,1));
        assertNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> new Payment("name", 42,2,-1,1));
        assertNull(thrown.getMessage());
        thrown = assertThrows(Exception.class, () -> payment1.setName(null));
        assertNotNull(thrown.getMessage());


    }













}
