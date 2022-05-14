import java.util.*;
public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age= sc.nextInt();
		
		if(age > 18) {
			System.out.println("you are adult");
		}
		else
		{
			System.out.println("You are not adult");
		}
	}

}
