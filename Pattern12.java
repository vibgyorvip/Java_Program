
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=5;
		
		for(int i=1; i<=row; i++)
		{
			//spaces
			int spaces = row -i;
			for(int j=1; j<=spaces ; j++)
			{
				System.out.print(" ");
			}
			//numbers
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
