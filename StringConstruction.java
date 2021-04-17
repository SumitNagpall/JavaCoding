//https://www.hackerrank.com/challenges/string-construction/problem
class StringConstruction
{
    static int stringConstruction(String s)
    {
    	int count=0;
    	String str="";
	    for(int i=0;i<s.length();i++)
	        if(str.indexOf(s.charAt(i))==-1)
	    	{
	    		count++;
	    		str+=s.charAt(i);
	    	}
	    return count;
    }
    public static void main(String[] args)
    {
    	String str="qwertyuqwert";
    	System.out.println(StringConstruction.stringConstruction(str));
    }
}