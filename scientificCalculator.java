import java.util.InputMismatchException;
import java.util.Scanner; //used read input from the user

public class scientificCalculator {
    public static void displayMenu(){
        System.out.println("--- Scientific Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("0. Exit");
    }
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        if (num2 == 0){
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    public static double squareRoot(double num){
        if (num < 0){
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(num);
    }
    public static double calculatePower(double base, double exponent){
        return Math.pow(base, exponent);
    }

    private static void performAddition(Scanner input) {
        try {
            System.out.println("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = input.nextDouble();
            double result = add(num1, num2);
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void performSubtraction(Scanner input) {
        try {
            System.out.println("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = input.nextDouble();
            double result = subtract(num1, num2);
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void performMultiply(Scanner input) {
        try {
            System.out.println("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = input.nextDouble();
            double result = multiply(num1, num2);
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void performDivision(Scanner input) {
        try {
            System.out.println("Enter the numerator: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the denominator: ");
            double num2 = input.nextDouble();
            double result = divide(num1, num2);
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void performSquareRoot(Scanner input) {
        try {
            System.out.println("Enter a number to calculate it's square root: ");
            double num = input.nextDouble();
            double result = squareRoot(num);
            System.out.println("Square root of " + num + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void performPower(Scanner input) {
        try {
            System.out.println("Enter the base: ");
            double base = input.nextDouble();
            System.out.println("Enter the exponent: ");
            double exponent = input.nextDouble();
            double result = calculatePower(base, exponent);
            System.out.println("Result: " + base + "^" + exponent + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
}