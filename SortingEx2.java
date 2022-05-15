
public class SortingEx2 {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selection sort
		//1 swap per iteration
		
		int arr[]= {8,4,6,5,1};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j]) 
				{
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		printArray(arr);
		
	}

}
