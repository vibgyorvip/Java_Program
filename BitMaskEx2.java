
public class BitMaskEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=5;
		int pos=1;//2nd bit
		//set bit
		int bitmask=1<<pos;
		int newnumber=bitmask | number;
		System.out.println(newnumber);
	}

}
