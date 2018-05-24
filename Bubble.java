public class Bubble{
	public static void main(String args[]){
	
		int arr[] = {22,-1,-5,0,66,33};
		int size = 6;
		for(int i=0;i<size-1;i++)
			for(int j=0;j<size-i;j++)
				if(arr[j+1] > arr[j])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
		System.out.println("the array after sorting is:");
		for(int i=0;i<6;i++)
			System.out.println(arr[i]);
	}


}