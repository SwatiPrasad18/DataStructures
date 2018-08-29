package questions.prog;

public class StringOfNumbers{
	public static void main(String[] args) {

		checkSuccessiveNumbers("34534535");
		checkSuccessiveNumbers("0965474");

	}

	public static void checkSuccessiveNumbers(String sStringToCheck)
	{
		boolean bSuccesive = false;		
		for(int iArr = 0; iArr <= sStringToCheck.length(); iArr++)
		{
			char cValue = sStringToCheck.charAt(iArr);
			char cValue2 = sStringToCheck.charAt(iArr+1);
			if((Character.getNumericValue(cValue2)-Character.getNumericValue(cValue)) !=1)
			{
				break;
			}
			else
				bSuccesive = true;
		}

		if(bSuccesive)
				System.out.println(sStringToCheck+" Successive Numbers");
		else
			System.out.println(sStringToCheck+" Not Successive Numbers");
	}
}

