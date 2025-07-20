import java.util.InputMismatchException;
import java.util.Scanner; //used read input from the user

public class scientificCalculator {


    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("Welcome to Scientific Calculator");

        while (run){
            displayMenu();
            try {
                System.out.println("Enter your choice: ");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        performAddition(input);
                        break;

                    case 2:
                        performSubtraction(input);
                        break;

                    case 3:
                        performMultiply(input);
                        break;

                    case 4:
                        performDivision(input);
                        break;

                    case 5:
                        performSquareRoot(input);
                        break;

                    case 6:
                        performPower(input);
                        break;

                    case 7:
                        preformSine(input);
                        break;

                    case 8:
                        preformCosine(input);
                        break;

                    case 9:
                        preformTangent(input);
                        break;

                    case 10:
                        preformNaturalLogrithm(input);
                        break;
                        
                    case 0:
                        run = false;
                        System.out.println("Exiting calculator. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid ipnut. Please choose a number from the menu");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number:");
            }
            System.out.println("\n---------------------------------------\n");
        }
        System.out.println("You want help ?? call the instructor");
        input.close();
    }

    public static void displayMenu(){
        System.out.println("--- Scientific Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. cosine");
        System.out.println("9. tangent");
        System.out.println("10. Natural Logrithm");
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
    public static double calculateSine (double degrees){
        return degrees;
    }
    public static double calculateCos (double degrees){
        return degrees;
    }
    public static double calculateTan (double degrees){
        return degrees;
    }
    public static double calculateNaturalLogrithm (double num) {
        return num;
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
    private static void preformSine(Scanner input){
        try{
            System.out.println("Enter the degrees: ");
            double degrees = input.nextDouble();
            double result = Math.sin(degrees);
            System.out.println(degrees + " will equal to "+ result+ " using sine");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void preformCosine(Scanner input){
        try{
            System.out.println("Enter the degrees: ");
            double degrees = input.nextDouble();
            double result = Math.cos(degrees);
            System.out.println(degrees + " will equal to "+ result+ " using cosine");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void preformTangent(Scanner input){
        try{
            System.out.println("Enter the degrees: ");
            double degrees = input.nextDouble();
            if (degrees % 180 == 90) {
                System.out.println("Tangent is undefined at " + degrees + " degrees.");
            } else {
                double result = Math.ceil(Math.tan(Math.toRadians(degrees)));
                System.out.println(degrees + " degrees = " + result + " using tangent");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! please enter a numeric value");
            input.next();
        }
    }
    private static void preformNaturalLogrithm(Scanner input){
        try {
            System.out.println("Enter a number to find it's logrithm to base 10: ");
            double num = input.nextDouble();
            if (num <0 ){
                System.out.println("Invalid input. cannot find the natural logrithm of a negative number");
            } else {
                double result = Math.log(num);
                System.out.println("The natural logrithm of "+ num + " is " + result);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! please enter a numeric value");
                input.next();
            }
        }
    }
}