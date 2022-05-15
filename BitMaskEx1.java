
public class BitMaskEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int pos=2;//3rd bit
		//GET Bit
		int bitmask=1<<pos;
		if((bitmask & number)==0)
		{
			System.out.println("bit was 0");
		}
		else
		{
			System.out.println("bit was 1");
		}

	}

}
