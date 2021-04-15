class Gemstones
{
	static int gemstones(String[] arr)
	{
		int ascii[]=new int[26],count=0;

		for(int i=0;i<arr.length;i++)										//Traversing all string
			for(int j=0;j<arr[i].length();j++)								//Traversing each character string
				if(arr[i].substring(j+1).indexOf(arr[i].charAt(j))==-1)		//Checking if its last occurence of character in String
					ascii[arr[i].charAt(j)-97]++;							//Update occurence of character in ascii array
	
		for(int i=0;i<ascii.length;i++)
			if(ascii[i]==arr.length)
				count++;													//Count of variable for each character

		return count;
    }
	public static void main(String[] args)
	{
		String arr[]={"abc","ab","baac"};
		System.out.println(Gemstones.gemstones(arr));
	}
}