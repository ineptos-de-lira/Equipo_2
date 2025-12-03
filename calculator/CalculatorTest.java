package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  CalculatorService calc = new CalculatorService();

  @Test
  void testAdd() {
    assertEquals(5, calc.add(2, 3));
  }

  @Test
  void testSubtract() {
    assertEquals(2, calc.subtract(5, 3));
  }

  @Test
  void testDivide() {
    assertEquals(2.5, calc.divide(5, 2));
    assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
  }

}