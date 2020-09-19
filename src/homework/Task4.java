package homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String appPassword = "power";
        String usersPassword = new Scanner(System.in).nextLine();
        if (appPassword.equals(usersPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
