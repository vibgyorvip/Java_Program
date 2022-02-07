/*A class can contain 5 things.
 * Data members
 * Member functions (Method)
 * Constructor
 * Static block
 * initialize block
 * Note:- The sequence of members does not matter inside the class .
 * Printing statement only alone is not allowed in class.bcoz class is a blue print only declaration is allowed .
 * If any statement is not type of declaration then not allowed in class . for e.g. if block is not allowed in class.
 * If u want to allow these things so u have to create a function then inside fuction u can write what ever u want .
 * 
 * */
class Emp1{
	private String name;
	private int salary;//Making all data as private in class is the e.g. of encapsulation .
	private String cname;
	void show() {
		//System.out.println(salary);
		System.out.println(name+salary+cname);
	}
	void setSalary(int s) {
		salary=s;
	}
	void setName(String n) {
		name=n;
	}
	void setCname(String c) {
		cname=c;
	}
	
}

public class OopEx2 {

	public static void main(String[] args) {
		Emp1 a=new Emp1();
		Emp1 b=new Emp1();
		a.show();
		b.show();
		a.setName("Ram Kumar");
		a.setSalary(120000);
		a.setCname("XYZ");
		b.setName("Shyam Kumar");
		b.setSalary(50000);
		b.setCname("ABC");
		a.show();
		b.show();
	}

}
