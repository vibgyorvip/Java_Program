class Shape{
	public void printArea() {
		System.out.println("Display area");
	}
}

class Triangle extends Shape{ //single level inheritance
	public void printArea(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

class EquilateralTriangle extends Triangle{// multi-level inheritance
	public void printArea(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

class Circle extends Shape{ //Heirarical inheritance
	public void printArea(int r) {
		System.out.println(3.14*r*r);
	}
}
public class OopsEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
