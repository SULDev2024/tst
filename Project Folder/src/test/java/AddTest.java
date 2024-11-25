import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAddNumbers() {
        Add addition = new Add();
        int result = addition.addNumbers(4, 5);
        assertEquals(9, result, "The sum of 4 and 5 should be 9");
    }

    @Test
    public void testAddNegativeNumbers() {
        Add addition = new Add();
        int result = addition.addNumbers(-3, -7);
        assertEquals(-10, result, "The sum of -3 and -7 should be -10");
    }

    @Test
    public void testAddZero() {
        Add addition = new Add();
        int result = addition.addNumbers(0, 5);
        assertEquals(5, result, "The sum of 0 and 5 should be 5");
    }
}
