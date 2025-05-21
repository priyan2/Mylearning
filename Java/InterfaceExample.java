package demo;

interface Demo{
	void show();
}

interface Demo1 {
	void show();
	void display();
}

class IDemo implements Demo,Demo1{
	 public void show() {
		 System.out.println("This is the Idemp show method");
	 }
	 public void display() {
		 System.out.println("This is the Idemp display method");
	 }
}


public class InterfaceExample {
	public static void main(String[] args) {
	Demo1 obj = new IDemo();
	obj.show();
	obj.display();
	
	}

}