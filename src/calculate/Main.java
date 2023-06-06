package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice;

        do {
            System.out.println("Enter first Number:");
            int firstNumber = sc.nextInt();
            System.out.println("Enter Second Number:");
            int secondNumber = sc.nextInt();
            System.out.println("Enter one of symbol +, -, * ,/:");
            char symbol = sc.next().charAt(0);
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' :");
            choice = sc.next().charAt(0);
        }while (choice=='Y');
    }
}