
public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1="hello";
		String name2="hello";
		
		/*s1 >s2 : return +ve value
		 *s1==s2 : return 0
		 *s1 <s2 : return -ve value
		 */
		if(name1.compareTo(name2) == 0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		/*
		if(name1 == name2) 
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings not equal");
		}*/
		
		/*
		if(new String("hello") == new String("hello"))
		{
			System.out.println("Stings are equal");
		}
		else {
			System.out.println("Strings not equal");
		}
		*/
	}

}
