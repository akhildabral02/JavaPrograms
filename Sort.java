public class Sort{
	public static void main(String args[]){
	
		int arr[] = {22,-1,-5,0,66,33};
		for(int i=0;i<6;i++)
			for(int j=i+1;j<6-1;j++)
				if(arr[j] > arr[j-1])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
		System.out.println("the array after sorting is:");
		for(int i=0;i<6;i++)
			System.out.println(arr[i]);
	}


}