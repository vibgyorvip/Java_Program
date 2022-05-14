
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=4;
		//outer loop
		for(int i=row; i>=0 ; i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
