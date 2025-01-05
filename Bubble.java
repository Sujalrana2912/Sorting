package Sort;
import java.util.*;
public class Bubble {

	
	public static void Bubble_sort(int n, int arr[])
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j]>arr[j+1])
					
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elemnt:");
		int n=sc.nextInt();
		int arr[] =new int[n];
		System.out.print("Enter elemnrt:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Unsorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Bubble_sort(n,arr);
		System.out.print("Sorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
}
