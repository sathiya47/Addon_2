package DAY_7;

import java.util.Scanner;

public class task3 {
	
	    public static void insertionSort(int[] arr) {

	        for (int i = 1; i < arr.length; i++) {

	            int key = arr[i];

	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {

	                arr[j + 1] = arr[j];

	                j = j - 1;

	            }

	            arr[j + 1] = key;

	        }

	    }

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);



	        System.out.print("Enter number of elements: ");

	        int n = scanner.nextInt();



	        int[] arr = new int[n];



	        System.out.println("Enter " + n + " elements:");

	        for (int i = 0; i < n; i++) {

	            arr[i] = scanner.nextInt();

	        }



	        insertionSort(arr);



	        System.out.println("Sorted array:");

	        for (int num : arr) {

	            System.out.print(num + " ");

	        }

	        scanner.close();

	    }
}
