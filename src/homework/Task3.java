package homework;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("How many random numbers should we display?");
        Scanner pow = new Scanner(System.in);
        Integer enteredNumber = pow.nextInt();
        System.out.println("With transferring or without? (Yes/No)");
        Scanner pow1 = new Scanner(System.in);
        String enteredAnswer = pow1.nextLine();
        for (int i = 0; i < enteredNumber; i++) {
            int generatedRandom = new Random().nextInt();
            if ("Yes".equalsIgnoreCase(enteredAnswer)){
                System.out.println(generatedRandom);
            }else {
                System.out.print(generatedRandom + " ");
            }
        }
    }
}