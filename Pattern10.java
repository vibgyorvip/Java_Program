
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=4;
		//upper half
		for(int i=1; i<=row; i++)
		{
			//1st part
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			//spaces
			int spaces=2*(row-i);
			for(int j=1;j<= spaces; j++)
			{
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
		for(int i=row; i>=1; i--)
		{
			//1st part
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			//spaces
			int spaces=2*(row-i);
			for(int j=1;j<= spaces; j++)
			{
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
