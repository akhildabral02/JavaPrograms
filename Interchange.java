package utillity;
import java.util.*;

class Interchange{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the size of Element:");
		int size = inp.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = inp.nextInt();
		//looking out for indexes to swap 
		int smaller_index = smaller(arr,size);
		int larger_index = larger(arr,size);
		//swapping begins
		int temp = arr[smaller_index];
		arr[smaller_index] = arr[larger_index];
		arr[larger_index] = temp;
		
		System.out.println("The Array after the Interchange is");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
		inp.close();
		
	}
	
	static int smaller(int[] a, int size){
		int small = a[0],index=0;
		for(int i=1;i<size;i++)
			if(a[i]<small) {
				small = a[i];
				index = i;
			}
				
		
		return index;
	}
	
	static int larger(int[] a,int size){
		int larger = a[0],index=0;
		for(int i=1;i<size;i++)
			if(a[i]>larger) {
				larger = a[i];
				index = i;
			}
		
		return index;
	}


}