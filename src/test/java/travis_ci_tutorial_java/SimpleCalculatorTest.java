package travis_ci_tutorial_java;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    public void testMinus() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.minus(5, 3));
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.divide(6, 3));
    }

    // ✅ STEP 34: edge-case test (divide by zero)
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        SimpleCalculator calc = new SimpleCalculator();
        calc.divide(5, 0);
    }
}
