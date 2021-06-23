import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private static StringCalculator stringCalc;

    @BeforeEach
    public void setUp() { stringCalc = new StringCalculator(); }

    @AfterEach
    public void tearDown() { stringCalc = null; }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1, -9, 5"));
    }

    @Test
    public void testTooBig() {
        assertEquals(StringCalculator.add("1, 2, 3, 1000, 1002"), 6);
    }
}
