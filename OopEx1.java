class Emp{
	public String name;
	private int salary;//Making data as private in class is the e.g. of encapsulation .
	public String cname;
	void show() {
		//System.out.println(salary);
		System.out.println(name+salary+cname);
	}
	void setSalary(int s) {
		salary=s;
	}
	
}

public class OopEx1 {

	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		a.show();
		b.show();
		a.name="Ram Kumar";
		a.setSalary(120000);
		a.cname="XYZ";
		b.name="Shyam Kumar";
		b.setSalary(50000);
		b.cname="ABC";
		a.show();
		b.show();
	}

}
