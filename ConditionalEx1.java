import java.util.*;
public class ConditionalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		switch(button){
		case 1: System.out.println("hello");
		break;
		
		case 2: System.out.println("namste");
		break;
		
		case 3: System.out.println("Banjour");
		break;
		
		default: System.out.println("Invalid Button");
		}
		
		
	}

}
