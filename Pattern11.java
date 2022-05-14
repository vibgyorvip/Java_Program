
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =5;
		//outer loop
		for(int i=1; i<=row; i++)
		{
			//spaces
			int spaces=row-i;
			for(int j=1; j<=spaces;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=row;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
