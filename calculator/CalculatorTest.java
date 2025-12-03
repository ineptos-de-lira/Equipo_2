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

  @Test
  void testPower() { 
    assertEquals(8.0, calc.power(2, 3)); 
  }

  @Test
  void testSqrt() { 
    assertEquals(3.0, calc.sqrt(9)); 
  }

  @Test
  void testModule() {
    assertEquals(1.0, calc.module(5, 2));
  }

  @Test
  void testSin() {
    assertEquals(0.0, calc.sin(0));
  }

  @Test
  void testCos() {
    assertEquals(1.0, calc.cos(0));
  }

  @Test
  void testTan() {
    assertEquals(0.0, calc.tan(0));
  }

}
