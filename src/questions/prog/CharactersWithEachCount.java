package questions.prog;

public class CharactersWithEachCount {

	public static void main(String[] args)
	{
		//displayCount("aaabbbaaaccc");
		
		int a=10;
		int b = 3;
		String status = (b<4)?"OK":(a>8)?"Edge":"Too many";
		System.out.println(status);
	}
	
	/*public static void displayCount(String s1)
	{
	
		for(int i = 0; i<s1.length();i++)
		{
			int count = 0;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;	
				}
				
			}
			System.out.println(s1.charAt(i)+":"+count);
		}*/
	//}
	
	
}
