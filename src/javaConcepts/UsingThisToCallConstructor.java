package javaConcepts;

public class UsingThisToCallConstructor {
	
	 UsingThisToCallConstructor() {
		this(5);
		System.out.println("Default Constructor");
	}
	
	UsingThisToCallConstructor(int a)
	{
		this(7,8);
		System.out.println("Single parameter constrauctor");
	}
	
	UsingThisToCallConstructor(int a, int b)
	{
		System.out.println("Two parameter constructor");
	}
	

	public static void main(String[] args)
	{
		UsingThisToCallConstructor uObj1 = new UsingThisToCallConstructor();

	}
	
}
