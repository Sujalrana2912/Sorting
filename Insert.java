package Sort;
import java.util.*;
public class Insert {

	public static void Insert_sort(int n,int arr[])
	{
		for(int i=0;i<=n-1;i++)
		{
			int j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number of element:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter an elemnt:");
		for(int i=0;i<n;i++)    
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.print("Unsorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		Insert_sort(n,arr);
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
