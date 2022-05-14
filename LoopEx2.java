import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int counter=1; counter <= 10 ; counter++) {
			
			System.out.println(number*counter);
		}
		
	}

}
