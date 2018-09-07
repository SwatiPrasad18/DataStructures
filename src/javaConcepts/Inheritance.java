package javaConcepts;

class A{

	public void show()
	{
		System.out.println("In parent");
	}
}

public class Inheritance extends A
{
public void show() {
	System.out.println("In child");
	
}

public void name() {
	System.out.println("In child again");
}

public static void main(String[] args)
{
	Inheritance b1 = new Inheritance();
	b1.show();
	b1.name();
	
	//for parent methods
	A a = new A();
	a.show();
	
}

	
}