/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase calculator = new ArithmeticBase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double x = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double y = scanner.nextDouble();

        for (Operation operation : Operation.values()) {
            double result = calculator.calculate(x, y, operation);
            System.out.println("Result of " + operation + " operation: " + result);
        }
    }
}
