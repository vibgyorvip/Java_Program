import java.util.*;
public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		for(int counter=1; counter <= number ; counter++) {
			sum =sum + counter;
		}
		System.out.println(sum);
		
	}

}
