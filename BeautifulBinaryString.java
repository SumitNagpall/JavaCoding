//https://www.hackerrank.com/challenges/beautiful-binary-string/problem
class BeautifulBinaryString
{
 	static int beautifulBinaryString(String b)
 	{
 		char arr[]=b.toCharArray();
 		int zero=-1,count=0;
 		while(zero+3<arr.length)
 		{
			if(arr[++zero]=='0')
			{ 		
	    		if(arr[zero+1]=='1' && arr[zero+2]=='0')
	    		{
	    			arr[zero+2]='1';
	    			count++;
	    			zero++;
	    		}
	    	}
    	}
    	//for(int i=0;i<arr.length;i++)
    	//	System.out.print(arr[i]);
    	return count;
    }
	public static void main(String[] args)
	{
		String str="010";
		System.out.println("\n"+BeautifulBinaryString.beautifulBinaryString(str));
	}
}