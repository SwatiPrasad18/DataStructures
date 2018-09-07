package javaConcepts;

abstract class AB{
	public void display()
	{
		System.out.println("In abstract display");
	}
	
	abstract void show();
}

public class AbstractClassPractise extends AB{
	
	 void show()
	{
		System.out.println("Abstract implemented in child");
	}
	 
	 public static void main(String[] args)
	 {
		AB a1 = new AbstractClassPractise();
		a1.display();
		a1.show();
		
		AbstractClassPractise o1= new AbstractClassPractise();
		o1.display();
		o1.show();
	 }

}
