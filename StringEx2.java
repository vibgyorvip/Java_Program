
public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Concatenation
		String firstName="Vipul";
		String lastName="Agnihotri";
		String fullName=firstName +" "+lastName;
		System.out.println(fullName);
		//String length
		System.out.println(fullName.length());
		//charAt
		for(int i=0;i<fullName.length();i++)
		{
			System.out.println(fullName.charAt(i));
		}
	}

}
