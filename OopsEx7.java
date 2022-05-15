interface Animall{
	public void walk();
}
interface harbivore{
	
}

class Horsee implements Animall , harbivore{//multiple inheritance in java interfaces is allowed.
	public void walk() {
		System.out.println("horse walks on 4 legs");
	}
}
public class OopsEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horsee horse= new Horsee();
		horse.walk();
	}

}
