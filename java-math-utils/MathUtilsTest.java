import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    MathUtils math = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, math.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, math.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, math.divide(6, 3), 0.01);
        assertEquals(-1.0, math.divide(5, 0), 0.01);
    }
}