class Empp{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);	
	}
	
	Empp()
	{
		//non-parameterized for e1 object
	}
	Empp(Empp e2)
	{
		//Copy Constructor
		this.name=e2.name;
		this.age=e2.age;
	}
	
}
public class OopsEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empp e1= new Empp();
		e1.name="vipul";
		e1.age=25;
		
		Empp e2= new Empp(e1);
		e2.printInfo();
	}

}
