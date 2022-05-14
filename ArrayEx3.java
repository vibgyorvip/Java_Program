//Linear Search

import java.util.*;
public class ArrayEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the number for search");
		int number=sc.nextInt();
		
		int marks[]=new int[size];
		
		for(int i=0; i< size; i++)
		{
			System.out.println("Enter the value of"+ (i+1) +" elements");
			marks[i]=sc.nextInt();
		}

		System.out.print("Array List :");
		for(int i=0; i< size; i++)
		{
			System.out.print(marks[i]+" ");
		}
		
		for(int i=0; i<marks.length;i++)
		{
			if(marks[i] == number)
			{
				System.out.println("Element Found at "+i+" index");
			}
		}
	}
	

}
