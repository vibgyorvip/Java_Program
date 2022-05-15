import java.util.*;
public class BitMaskEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// update bit
		
		Scanner sc=new Scanner(System.in);
		int oper=sc.nextInt();
		//oper=1 set bit
		//oper=0 clear bit
		
		int number =5;
		int pos =1;// 2nd bit
		
		int bitmask=1<<pos;
		if(oper==1)
		{
			//set
			int newnumber=bitmask | number;
			System.out.println(newnumber);
		}
		else
		{
			//clear
			int newbitmask=~bitmask;
			int newnumber= newbitmask & number;
			System.out.println(newnumber);
			
		}
		
		

	}

}
