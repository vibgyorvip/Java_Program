//Searching an element in 2-D array List
import java.util.*;
public class ArrayEX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int number=sc.nextInt();
		
		int marks[][]= new int[rows][cols];
		
		//input as 2D-ArrayList
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		
		//Output
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
	
		//Searching
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(marks[i][j]==number)
				{
					System.out.println("found at ("+i+","+j+") indices");
				}
			}
		}
	}

}
