package questions.prog;

/**
 * @author PSWATI1
 *
 */
public class CheckIfNumberDivisibleBy20 {

	public static void main(String args[])
	{
		if(checkDivisibleBy20("5646768879898778"))
			System.out.println("Yes divisible");
		else
			System.out.println("Not divisible");
		
		
	}
	
	public static boolean  checkDivisibleBy20(String sNumber)
	{
		int iLastTwoDigits = Integer.parseInt((sNumber.substring(sNumber.length()-2, sNumber.length())));
		//System.out.println(iLastTwoDigits);	
		
		if(iLastTwoDigits%2 == 0 && iLastTwoDigits%5==0)
			return true;
		else
			return false;
			
	}
}
