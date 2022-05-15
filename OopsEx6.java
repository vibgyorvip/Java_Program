abstract class Animal{
	abstract public void walk();
	//constructor
	Animal(){
		System.out.println("Animal Created");
	}
	public void eat()
	{
		System.out.println("Animal eats");
	}
}

class Horse extends Animal{
	Horse(){
		System.out.println("Horse Created");
	}
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}

class Chicken extends Animal{
	public void walk() {
		System.out.println("Walks on 2 legs");
	}
}
public class OopsEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse horse = new Horse();
		horse.walk();
		horse.eat();
		
	}

}
