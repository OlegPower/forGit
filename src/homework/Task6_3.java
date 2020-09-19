package homework;

public class Task6_3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0 || myArray[i] % 9 == 0) {
                System.out.println(myArray[i]);
            }
        }
    }
}
