class Emp{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	
	//parameterized constructor
	Emp(String name , int age){
		this.name=name;
		this.age=age;
		System.out.println("Constructor called");
	}
}
public class OopsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp s1= new Emp("Vipul",25);
		s1.printInfo();
	}

}
