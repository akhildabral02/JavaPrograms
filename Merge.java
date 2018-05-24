import java.util.*;

class Merge{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the array of 3 Elements:");
		int arr1[] = new int[3];
		for(int i=0;i<3;i++)
			arr1[i] = inp.nextInt();
			
		System.out.println("Enter the element for 4 elements");
		int arr2 = new int[4];
		for(int i=0;i<3;i++)
			arr2[i] = inp.nextInt();
		int i=0,j=0,k=0;
		int final[] = new int[7];
		while(i<arr1.length || j < arr2.length){
			int flag=0;
			if(arr1[i]<arr2[j]){
				final[k] = arr1[i];
				k+=1;
				i+=1;
				flag=1;
			}
			else{
				final[k] = arr2[j];
				k+=1;
				j+=1;
				flag=1;
			}
			if(flag==1)
				continue;
			else{
				i++;
				j++;
			}
		}
		System.out.println("The final array after merging is:");
		for(int i=0;i<7;i++)
			System.out.println(final[i]);
	}
	
	
		
}