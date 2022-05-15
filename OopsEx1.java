class Student{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	
	//non-parameterized constructor
	Student(){
		System.out.println("Constructor called");
	}
}
public class OopsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Object of Student class
		Student s1= new Student();
		s1.name="vipul";
		s1.age=25;
		
		s1.printInfo();
	}

}
