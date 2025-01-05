package Sort;
import java.util.*;
public class selection {

	public static void Selection_sort(int n, int arr[])
	{
		for(int i=0;i<=n-2;i++)
		{
			int min=i;
			for(int j=i;j<=n-1;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n=sc.nextInt();
		
		
		int arr[]=new int[n];
		System.out.print("Enter a element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Unsorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		Selection_sort(n,arr);
		System.out.println("Sorted ARRAY:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
	
	}
}
