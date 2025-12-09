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
}
