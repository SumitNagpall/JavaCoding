class HackerrankInString
{
	public static String IsHackerrankInString(String hackerrank)
	{
		String test="hackerrank";
		int j=0;
		for(int i=0;i<hackerrank.length();i++)
		{
			if (hackerrank.charAt(i)==test.charAt(j))
				j++;
			if (j==10)
				return "Yes";
		}
		return "No";
	}
	public static void main(String[] args)
	{
		System.out.println(IsHackerrankInString("haacckkkkerrannkk"));
	}
		
}