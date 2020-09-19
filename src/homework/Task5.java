package homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter 5 numbers");
        int totalSum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number");
            Scanner scanner = new Scanner(System.in);
            int currentNumber = scanner.nextInt();
            totalSum = totalSum + currentNumber;
        }
        System.out.println(totalSum);
    }
}
