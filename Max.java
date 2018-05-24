package utillity;
import java.util.*;

public class Max{
	public static Scanner inp = new Scanner(System.in);
	
	public static void sort(int arr[],int size) {
		for(int i=0;i<size;i++)
			for(int j=i+1;j<size;j++)
				if(arr[j]>arr[j-1])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
		
		
	}
	public static int sort_and_find(int arr1[],int arr2[],int n1,int n2) {
		sort(arr1,n1);
		sort(arr2,n2);
		return arr1[n1-1] * arr2[0];	
	}
	
	public static void main(String args[]) {
		
		int arr1[] = {22,5,3,11,6};
		int arr2[] = {-1,55,2,8};
		int n1 = 5;
		int n2 = 4;
		System.out.println("The product of minimum and maximum is:"+sort_and_find(arr1, arr2, n1, n2));
	}
	
}