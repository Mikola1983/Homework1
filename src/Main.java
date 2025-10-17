import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Массивы, урок 2. Домашнее задание №9.");
        // Задание 1.
        int[] inputArray1 = {8000, 10000, 12000, 20000, 15000};
        int[] outputArray1 = new int[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        int mid = 0;
        for (int tax : inputArray1) {
            sum = sum + tax;
            if (tax < min) {
                min = tax;
            }
            if (tax > max) {
                max = tax;
            }
            mid++;
        }
        mid = sum / mid;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = mid;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        //Задание 2.
        int[] inputArray2 = {35000, 30000, 50000, 43000, 37500};
        double[] outputArray2 = new double[5];
        int i = 0;
        for (int nalog : inputArray2) {
            double nal = nalog * 0.13;
            outputArray2[i] = nal;
            i++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        // Задание 3.
        int[] inputArray3 = {5000, 6000, 4000, 5000, 8000};
        boolean[] outputArray3 = new boolean[5];
        i = 0;
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[i] = true;
            }
            i++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        // Задание 4.
        int[] inputArray4 = {5000, 6000, 4000, -5000, 8000};
        boolean[] outputArray4 = {true};
        for (int money : inputArray4) {
            if (money < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        // Задание 5.
        int[] inputArray5 = {5000, -6000, -4000, -5000, 8000};
        int[] outputArray5 = {0};
        for (int rent : inputArray5) {
            if (rent > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}