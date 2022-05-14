
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=4;
		int cloumn=5;
		//outer loop
		for(int i=1; i<=row ; i++){
			//inner loop
			for(int j=1; j<=cloumn ; j++)
			{
				// cell
				if(i==1 || j==1 || i==row || j==cloumn)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
