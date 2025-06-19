package DAY9;

public class main {
	public static void main(String[] args) {   //rank finder
		
        int[] arr = {10, 20, 20, 30, 40}; // sorted array
        int target = 20;
        int rank = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target)
                rank++;
            else
                break;
        }

        System.out.println("Rank of " + target + " is: " + rank);
    }
}


