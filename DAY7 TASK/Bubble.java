package DAY_7;

import java.util.Arrays;
	/*public class Bubble {
    public static void findBubble(int[] sample) {
        for (int i = 0; i < sample.length - 1; i++) {
            for (int j = 0; j < sample.length - i - 1; j++) {
                if (sample[j] > sample[j + 1]) {
                    int temp = sample[j];
                    sample[j] = sample[j + 1];
                    sample[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sample = {56, 23, 87, 19, 30};
        findBubble(sample);
        System.out.println("Sorted array: " + Arrays.toString(sample));
    }
} */
import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void findBubble(int[] sample) {
        for (int i = 0; i < sample.length - 1; i++) {
            for (int j = 0; j < sample.length - i - 1 ; j++) {
                if (sample[j] > sample[j + 1]) {
                    int temp = sample[j];
                    sample[j] = sample[j + 1];
                    sample[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] sample = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            sample[i] = sc.nextInt();
        }

        findBubble(sample);

        System.out.println("Sorted array: " + Arrays.toString(sample));

        sc.close();
    }
}


