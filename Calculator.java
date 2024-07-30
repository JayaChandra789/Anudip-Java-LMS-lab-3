package nenu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String continueOperation;
        
        do {
            System.out.print("Enter number 1: ");
            int a = user_input.nextInt();
            System.out.print("Enter number 2: ");
            int b = user_input.nextInt();
            System.out.println("1.[For-Add], 2.[For-Sub], 3.[For-Multiply], 4.[For-Division]");
            System.out.print("Enter operation: ");
            int cal = user_input.nextInt();
            
            switch(cal) {
                case 1:
                    double add = a + b;
                    System.out.print("Addition is: " + add);
                    break;
                case 2:
                    double sub = a - b;
                    System.out.print("Subtraction is: " + sub);
                    break;
                case 3:
                    double multiply = a * b;
                    System.out.print("Multiplication is: " + multiply);
                    break;
                case 4:
                    if (b != 0) {
                        double division = (double) a / b;
                        System.out.print("Division is: " + division);
                    } else {
                        System.out.print("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.print("Invalid operation");
                    break;
            }
            
            System.out.print("\nDo you want to perform another operation? (yes/no): ");
            continueOperation = user_input.next();
        } while (continueOperation.equalsIgnoreCase("yes"));
        
        user_input.close();
    }
}
