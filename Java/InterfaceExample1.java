package demo;
interface Shape1{
	void draw();
	
}
class Triangle implements Shape1{
	public void draw() {
		System.out.println("This is a Trianngle class");
	}
}

class Rectangle1 implements Shape1{
	public void draw() {
		System.out.println("This is a rectangle class");
	}
}


public class InterfaceExample1 {
	public static void main(String[] args) {
		Shape1 obj = new Triangle();
		obj.draw();
		obj = new Rectangle1();
		obj.draw();
	}

}
