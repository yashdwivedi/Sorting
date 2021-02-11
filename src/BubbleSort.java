import java.util.*;
public class BubbleSort {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<10;i++)
			arr[i] = sc.nextInt();
		BubbleSort obj = new BubbleSort();
		obj.bubbleSort(arr);
		System.out.println("Sorted array is: ");
		obj.printArray(arr);
		sc.close();
	}
	
	
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	

}
