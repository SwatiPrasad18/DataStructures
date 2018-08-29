package questions.prog;

public class NearestMultipleof10 {

	public static void main(String args[])
	{
		displayNearestMultipleOf10(189);
		displayNearestMultipleOf10(18);
		displayNearestMultipleOf10(10008);
		displayNearestMultipleOf10(1);
	}
	
	public static void displayNearestMultipleOf10(int value)
	{
		if(value%10 < 5)
		{
			System.out.println((value/10)*10);
		}
		else
			System.out.println(((value+10)/10)*10);
	}
}
