package practice;

import java.util.Scanner;

public class mainpro3 {
	public static void palindrom(String word) {
			
		char arr[]=word.toCharArray();
		
			
			int end=arr.length-1;
			
			
			for(int start=0;start<end;) {
			if(arr[start]!=(arr[end])) {
				
				System.out.println("not a palindrome");
				return;
		}
			
			start++;
			end--;
			
			}
			System.out.println("palindrome");
	}
		public static void main(String[] args) {
			System.out.println("Enter the value:");
			
			Scanner s=new Scanner(System.in);
			String word=s.nextLine();
			
			mainpro3.palindrom(word);
			
			

		}

	}




