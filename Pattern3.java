
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=4;
		//outer loop
		for(int i=1; i<=number ; i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
