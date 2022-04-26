import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
//встречается ли под.cтрока внутри этой строки
public class SplitStringFilterTest {
    SplitStringFilter filter = new SplitStringFilter("мыла");

    @Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "мыла");
    }

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("мама мыла раму"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("мама Мыла раму"));
        assertFalse(filter.apply("папа мыл раму"));
    }

}