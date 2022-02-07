/*
 * static variable
 * static method
 * static block
 * static nested class
 */
//static variable:- A common member for every object of that class .
//Can be accessed via class name and reference variable.
//Allocated when the class load in memory.
//at the time of loading class only static member will create in memory. it can be accessable via class name or refrence variable.
//
class Empp{
	String name;
	static String cname;
	void show() {
		System.out.println(name+"\t"+cname);
	}
}

public class StaticBasicEx {

	public static void main(String[] args) {
		Empp.cname="XYZ";//static member can be directly accessed via class name.
		Empp a = new Empp();
		Empp b = new Empp();
		a.name="Ram kumar";
		//a.cname="XYZ";
		b.name="Shyam kumar";
		//b.cname="XYZ";
		a.show();
		b.show();

	}

}
