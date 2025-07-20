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
}