class Emp2{
	String name;
	static String cname;
	void show() {
		System.out.println(name + "/t" + cname);
	}
	static void setCname(String c) {
		cname=c;
	}
	static void display() {
		System.out.println("Hello Emp2 ");
	}
}
public class StaticBasicEx2 {

	public static void main(String[] args) {
		Emp2.display();

	}

}
