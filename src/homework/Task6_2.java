package homework;

public class Task6_2 {
    public static void main(String[] args) {
        double[] myArray = {11, 5.8, 11.1, 10.9, 44.3};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
            min = Math.min(min, myArray[i]);
        }
        System.out.println("The largest number in myArray: " + max);
        System.out.println("The smallest number in myArray: " + min);
    }
}
