import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class EndingStringFilterTest {

    EndingStringFilter filter = new EndingStringFilter("раму");

    @Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "раму");
    }

    @Test
    public void testApplyTrue() {
        assertTrue(filter.apply("мама мыла раму"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("мама Мыла кота"));
        assertFalse(filter.apply("папа мыл рамочку"));
    }



}