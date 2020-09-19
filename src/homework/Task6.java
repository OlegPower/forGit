package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int enteredNumbersCount = scanner.nextInt();
        int[] myArray = new int[enteredNumbersCount];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter a number");
            Scanner scanner1 = new Scanner(System.in);
            int userInput = scanner1.nextInt();
            myArray[i] = userInput;
        }
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            int currentNumber = myArray[i];
            if (currentNumber % 2 == 0) {
                evenNumbers.add(currentNumber);
            } else {
                oddNumbers.add(currentNumber);
            }
        }
        System.out.println("These are odd numbers: " +oddNumbers);
        System.out.println("These are even numbers: " +evenNumbers);
    }
}

