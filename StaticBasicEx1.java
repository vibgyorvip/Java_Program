/*
  * static method
  * can be accessed via class name and reference name.
  * allocated when the class loads in the memory.
  * can access static member but can not access non-static member of that class .
*/
class Emppp{
	String name;
	static String cname;
	void show() {
		System.out.println(name+"\t"+cname);
	}
	static void setCname(String c) {//static method
		cname=c;
	}
}

public class StaticBasicEx1 {

	public static void main(String[] args) {
		Emppp.setCname("XYZ");//static member can be directly accessed via class name.
		Emppp a = new Emppp();
		Emppp b = new Emppp();
		a.name="Ram kumar";
		//a.cname="XYZ";
		b.name="Shyam kumar";
		//b.cname="XYZ";
		a.show();
		b.show();

	}

}
