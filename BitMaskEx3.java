
public class BitMaskEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//clear bit
		int number =5;
		int pos=2;
		
		int bitmask=1<<2;
		int notbitmask= ~bitmask;
		int newnumber= notbitmask & number;
		System.out.println(newnumber);

	}

}
