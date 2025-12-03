package calculator;

/** This is the Calculator class to set the functions of it.  */
public class CalculatorService {
  
  /** Function to add two numbers. */
  public double add(double a, double b) {
    return a + b;
  }

  /** Function to substract two numbers. */
  public double subtract(double a, double b) {
    return a - b;
  }

  /** Function to multiply two numbers. */
  public double multiply(double a, double b) {
    return a * b;
  }

  /** Function to divide two numbers. */
  public double divide(double a, double b) {
    if (b == 0) {
      throw new ArithmeticException("No se puede dividir por cero");
    }

    return a / b;
  }

  /** Function to power a number. */
  public double power(double base, double exp) {
    return base * exp;
  }

  /** Function to square a number. */
  public double sqrt(double a) {
    if (a < 0) { 
      throw new IllegalArgumentException("No raíz negativa");
    }
    return Math.sqrt(a);
  }
}
