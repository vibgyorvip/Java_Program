
public class StringBuilderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder Class strings are mutable .
		StringBuilder sb= new StringBuilder("Tony");
		System.out.println(sb);
		//charAt
		System.out.println(sb.charAt(0));
		
		//setCharAt
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//insert at any index
		sb.insert(0, 'S');
		System.out.println(sb);
		
		//delete a char or substring
		sb.delete(2, 4);
		System.out.println(sb);
		
		//append
		sb.append('k');
		sb.append('e');
		sb.append('r');
		System.out.println(sb);
		
		//length
		
		System.out.println(sb.length());
	}

}
