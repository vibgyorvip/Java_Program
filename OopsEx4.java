class ABC{
	String name;
	int age;
	//Function overloading ==> Compile time polymorphism
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name, int age) {
		System.out.println(name+" "+age);
	}
}
public class OopsEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC s1= new ABC();
		s1.name="Vipul";
		s1.age=25;
		s1.printInfo(s1.name);
		s1.printInfo(s1.age);
		s1.printInfo(s1.name, s1.age);
	}

}
