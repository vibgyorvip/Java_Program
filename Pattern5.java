
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=4;
		//outer loop
		for(int i=1; i<=row ; i++)
		{
			//space printing loop
			for(int j=1; j<= row -i ; j++)
			{
				System.out.print(" ");
			}
			
			//star printing loop
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
