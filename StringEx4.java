
public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//substring(begin index , end index)
		String fullName="Vipul Agnihotri";
		String lastName=fullName.substring(6, fullName.length());
		//String lastName=fullName.substring(6);
		System.out.println(lastName);
		String firstName=fullName.substring(0, 5);
		System.out.println(firstName);

	}

}
