class Employee{
	public String name;
	public int salary;
	public String cname;
	
}

public class OopEx {

	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		System.out.println(a.name+a.salary+a.cname);
		System.out.println(b.name+b.salary+b.cname);
		a.name="Ram Kumar";
		a.salary=120000;
		a.cname="xyz";
		b.name="Shyam Kumar";
		b.salary=50000;
		b.cname="abc";
		System.out.println(a.name+a.salary+a.cname);
		System.out.println(b.name+b.salary+b.cname);
		
		

	}

}
