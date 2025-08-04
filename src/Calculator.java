import java.util.Scanner;

public class Calculator {

    // Methods for operations as mentioned in the Question
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose operation: 1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            int choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;
            switch (choice) {
                case 1 -> result = add(num1, num2);
                case 2 -> result = subtract(num1, num2);
                case 3 -> result = multiply(num1, num2);
                case 4 -> result = divide(num1, num2);
                default -> {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
