//Class object and main method in same class
/*class Test{
	String x;
	int y;
	void show() {
		System.out.println(x+y);
	}
	
}
public class OopEx3 {

	public static void main(String[] args) {
		Test a=new Test();
		a.x="Ram Kumar";
		a.y=10;
		a.show();
	}

}*/
// ctrl + shift + F for automatic formatting

public class OopEx3 {
	String x;
	int y;

	void show() {
		System.out.println(x + y);// ctrl+ space then type sys and select 2nd one.
	}

	public static void main(String[] args) {
		OopEx3 a = new OopEx3();// ctrl + space then type new it will write object creation statement .
		a.x = "Ram Kumar";
		a.y = 10;
		a.show();
	}

}
