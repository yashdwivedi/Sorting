import java.util.Scanner;

public class NewSort {
	
	
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    void printArray1(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<10;i++)
			arr[i] = sc.nextInt();
		NewSort obj = new NewSort();
		obj.sort(arr);
		System.out.println("Sorted array is: ");
		obj.printArray1(arr);

	}

}
