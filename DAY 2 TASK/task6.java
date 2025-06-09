package practice;

import java.util.Arrays;

public class task6 {
	public static void main(String[] args) {
				
					
				int[] arr= {2,3,4,4,5,8,2,3};
				
				Arrays.sort(arr);

				int start=0;
				
				for(int i=1;i<=arr.length-1;i++)
				{
					if(arr[start]!=arr[i])
					{
						start++;
						arr[start]=arr[i];
					}
					
				}
				
				
				for(int i=0;i<=start;i++)
				{
					System.out.println(arr[i]);
				}
				
			
				
				
			}
		}




