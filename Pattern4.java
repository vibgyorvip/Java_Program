public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=4;
		//outer loop
		for(int i=number; i>=1 ; i--) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
