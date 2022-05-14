
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=5;
		//upper half
		for(int i=1; i<=row ;i++)
		{
			//spaces
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//lower half
				for(int i=row; i>=1 ;i--)
				{
					//spaces
					for(int j=1; j<=row-i; j++)
					{
						System.out.print(" ");
					}
					//star
					for(int j=1; j<=2*i-1; j++)
					{
						System.out.print("*");
					}
					
					System.out.println();
				}
	}

}
