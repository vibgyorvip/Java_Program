import java.util.*;
public class ArrayEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array List");
		int size = sc.nextInt();
		int marks[]= new int[size];
		
		//input
		for(int i=0; i<size ; i++)
		{ 
			System.out.println("Enter the value of"+ (i+1) +" element" );
			marks[i]=sc.nextInt();
		}
		
		//output
		System.out.println("Your Array list :");
		for(int i=0; i<size ;i++)
		{
			System.out.print(marks[i]+" ");
		}
	}

}
