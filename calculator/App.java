package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Main class of the calculator application. */
public class App {

  /** Main fuction of the calculator application. */
  public static void main(String[] args) {
    CalculatorService calc = new CalculatorService();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      try {
        mostrarMenu();
        System.out.print(" Selecciona una opción: ");
        int option = scanner.nextInt();

        if (option == 11) {
          running = false;
          System.out.println("Saliendo de la calculadora.");
          continue;
        }

        if (option < 1 || option > 11) {
          System.out.println(" Opción no válida");
          continue;
        }

        double a;
        double b = 0;

        System.out.print("Ingresa el primer número: ");
        a = scanner.nextDouble();

        boolean unNumero = (option == 6 || option == 8 || option == 9 || option == 10);

        if (!unNumero) {
          System.out.print("Ingresa el segundo número: ");
          b = scanner.nextDouble();
        }

        double result = 0;

        switch (option) {
          case 1:
            result = calc.add(a, b);
            break;
          case 2:
            result = calc.subtract(a, b);
            break;
          case 3:
            result = calc.multiply(a, b);
            break;
          case 4:
            result = calc.divide(a, b);
            break;
          case 5:
            result = calc.power(a, b);
            break;
          case 6:
            result = calc.sqrt(a);
            break;
          case 7:
            result = calc.module(a, b);
            break;
          case 8:
            result = calc.sin(a);
            break;
          case 9:
            result = calc.cos(a);
            break;
          case 10:
            result = calc.tan(a);
            break;
          default:
            break;
        }

        System.out.println("El resultado de la operación es: " + result);

      } catch (InputMismatchException e) {
        System.out.println("Debes ingresar números válidos.");
        scanner.nextLine();
      } catch (ArithmeticException | IllegalArgumentException e) {
        System.out.println("Hubo un error haciendo la Operación.");
      }
    }
    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("\n--- Menú principal ---");
    System.out.println("1.  Suma");
    System.out.println("2.  Resta");
    System.out.println("3.  Multiplicación");
    System.out.println("4.  División");
    System.out.println("5.  Potencia");
    System.out.println("6.  Raíz Cuadrada");
    System.out.println("7.  Módulo");
    System.out.println("8.  Seno");
    System.out.println("9.  Coseno");
    System.out.println("10. Tangente");
    System.out.println("11. Salir");
  }
}