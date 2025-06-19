package post_assignment;

public class ass_9 {
	public void lowerbound()
	{
		int arr[]= {2,3,4,5,12,35,77};
		int target=356;
		int left=0;
		int right=arr.length;
		int mid;
		while(left<right)
		{
			mid=(left+right)/2;

			if(arr[mid]<target)
			{

				left=mid+1;

			}

		}

			try
			{
				if(((arr[left])|(arr[right]))>=target)
				{
					System.out.println("Low bound found ");
				}

				else if(target>(arr[left]|arr[right]))
				{
					System.out.println("Out of bounds");
				}
				
			}

			catch(Exception e)
			{
				System.out.println("out of bounds,no low bound!!");
			}

		}

public void upperbound()
{
	int[] arr = {1, 2, 4, 4, 5, 7};
    int target = 4;

    int left = 0;
    int right = arr.length;
    int upperBoundIndex;

    while (left < right) {
        int mid = (left + right) / 2;
        if (arr[mid] <= target) {
        	left = mid + 1;
        } 
        else {
        	right = mid;
        }
    }

    upperBoundIndex = left;

    if (upperBoundIndex < arr.length) {
        System.out.println("Upper bound of " + target + "at index: " + upperBoundIndex + ", value: " + arr[upperBoundIndex]);
    } else {
        System.out.println("Upper bound of " + target + " is out of array bounds");
    }
}

public void firstlastpos()
{
	int[] arr = {5, 7, 7, 8, 8, 10};
    int target = 8;

    int first = -1, last = -1;

    // First occurrence (lower bound)
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] >= target)
            high = mid - 1;
        else
            low = mid + 1;
    }
    if (low < arr.length && arr[low] == target)
        first = low;

    // Last occurrence (upper bound - 1)
    low = 0; high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] <= target)
            low = mid + 1;
        else
            high = mid - 1;
    }
    if (high >= 0 && arr[high] == target)
        last = high;

    System.out.println("First: " + first + ", Last: " + last);
}

	public static void main(String[] args) {
		ass_9 a1=new ass_9();
		a1.lowerbound();
		a1.upperbound();
		a1.firstlastpos();
		

	}

}


