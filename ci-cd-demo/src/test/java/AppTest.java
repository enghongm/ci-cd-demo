import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	 // Create an instance of the Calculator class to test
    AppCalc calculator = new AppCalc();

    // Test for the 'add' method
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "The addition result should be 5");
        assertEquals(0, calculator.add(-2, 2), "The addition result should be 0");
    }

    // Test for the 'subtract' method
    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "The subtraction result should be 1");
        assertEquals(-4, calculator.subtract(-2, 2), "The subtraction result should be -4");
    }
}
