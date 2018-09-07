package javaConcepts;

public class StaticPolymorphism {
	
	public void display(String name)
	{
		System.out.println("String: "+name);
	}
	
	public void display(int val)
	{
		System.out.println("Integer: "+val);
	}
	
	public static void main(String[] args)
	{
		StaticPolymorphism stPoly1 = new StaticPolymorphism();
		stPoly1.display(666);
		stPoly1.display("Rational");
		
	}

}
