//2-D Array
import java.util.*;
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int marks[][]= new int[rows][cols];
		
		//input
		//rows
		for(int i=0; i<rows;i++)
		{
			//columns
			for(int j=0;j<cols;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		
		//output
		//rows
		for(int i=0; i<rows;i++)
		{
			//columns
			for(int j=0;j<cols;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	}

}
